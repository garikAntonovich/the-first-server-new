package by.iharantanovich.thefirstservernew.service.impl;

import by.iharantanovich.thefirstservernew.model.File;
import by.iharantanovich.thefirstservernew.model.TypeOfDocument;
import by.iharantanovich.thefirstservernew.service.FileTypeIdentificationService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FileTypeIdentificationServiceImpl implements FileTypeIdentificationService {

    @Override
    public Map<TypeOfDocument, File> identityFileType(List<File> files) {

        Map<TypeOfDocument, File> typesFileMap = new HashMap<>();

        for (File file : files) {

            String data = file.getData();

            if (data.endsWith("</SKP_REPORT_KS>")) {
                typesFileMap.put(TypeOfDocument.MAIN, file);
            } else if (data.endsWith("</Inf_Pay_Doc>")) {
                typesFileMap.put(TypeOfDocument.SUPPLEMENTARY, file);
            }
        }

        return typesFileMap;
    }
}
