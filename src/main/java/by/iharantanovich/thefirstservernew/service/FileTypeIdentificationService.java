package by.iharantanovich.thefirstservernew.service;

import by.iharantanovich.thefirstservernew.model.File;
import by.iharantanovich.thefirstservernew.model.DocumentType;

import java.util.List;
import java.util.Map;

public interface FileTypeIdentificationService {

    Map<DocumentType, File> identityFileType(List<File> files);
}
