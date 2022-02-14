package by.iharantanovich.thefirstservernew.service.impl;

import by.iharantanovich.thefirstservernew.model.TypeOfDocument;
import by.iharantanovich.thefirstservernew.model.File;
import by.iharantanovich.thefirstservernew.service.GroupingByTypeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class GroupingByTypeServiceImpl implements GroupingByTypeService {

    @Override
    public List<File> groupByType(Map<TypeOfDocument, File> documentTypeFileMap) {

        List<File> files = new ArrayList<>();

        for (TypeOfDocument key : documentTypeFileMap.keySet()) {
            if (key.equals(TypeOfDocument.MAIN) || key.equals(TypeOfDocument.SUPPLEMENTARY)) {
                files.add(documentTypeFileMap.get(key));
            }
        }

        return files;
    }
}
