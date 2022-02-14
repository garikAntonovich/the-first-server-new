package by.iharantanovich.thefirstservernew.service.impl;

import by.iharantanovich.thefirstservernew.model.File;
import by.iharantanovich.thefirstservernew.service.ExtractingFilesService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Service
public class ExtractingFilesServiceImpl implements ExtractingFilesService {

    @Override
    public List<File> extractFiles(MultipartFile multipartFile) {

        List<File> fileList = new ArrayList<>();

        try (ZipInputStream zipInputStream = new ZipInputStream(multipartFile.getInputStream())) {

            ZipEntry zipEntry;
            String fileName;
            String fileData;

            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                fileName = zipEntry.getName();
                fileData = new String((zipInputStream.readNBytes((int) zipEntry.getSize())));
                File file = new File(fileName, fileData);
                fileList.add(file);
                zipInputStream.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileList;
    }
}
