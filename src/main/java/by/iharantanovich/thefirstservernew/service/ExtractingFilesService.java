package by.iharantanovich.thefirstservernew.service;

import by.iharantanovich.thefirstservernew.model.File;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ExtractingFilesService {

    List<File> extractFiles(MultipartFile multipartFile);
}
