package by.iharantanovich.thefirstservernew.service;

import by.iharantanovich.thefirstservernew.model.File;
import by.iharantanovich.thefirstservernew.model.TypeOfDocument;

import java.util.List;
import java.util.Map;

public interface FileTypeIdentificationService {

    Map<TypeOfDocument, File> identityFileType(List<File> files);
}
