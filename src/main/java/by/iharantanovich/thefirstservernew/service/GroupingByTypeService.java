package by.iharantanovich.thefirstservernew.service;

import by.iharantanovich.thefirstservernew.model.TypeOfDocument;
import by.iharantanovich.thefirstservernew.model.File;

import java.util.List;
import java.util.Map;

public interface GroupingByTypeService {

    List<File> groupByType(Map<TypeOfDocument, File> documentTypeFileMap);
}
