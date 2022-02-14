package by.iharantanovich.thefirstservernew.service;

import by.iharantanovich.thefirstservernew.model.File;
import by.iharantanovich.thefirstservernew.model.DocumentType;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FileTypeIdentificationServiceImpl implements FileTypeIdentificationService {

    @Override
    public Map<DocumentType, File> identityFileType(List<File> files) {

        Map<DocumentType, File> typesFileMap = new HashMap<>();

        for (File file : files) {

            String data = file.getData();

            if (data.endsWith("</SKP_REPORT_KS>")) {
                typesFileMap.put(DocumentType.MAIN, file);
            } else if (data.endsWith("</Inf_Pay_Doc>")) {
                typesFileMap.put(DocumentType.SUPPLEMENTARY, file);
            }
        }

        return typesFileMap;
    }
}
