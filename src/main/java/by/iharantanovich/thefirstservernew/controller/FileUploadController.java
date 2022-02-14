package by.iharantanovich.thefirstservernew.controller;

import by.iharantanovich.thefirstservernew.model.File;
import by.iharantanovich.thefirstservernew.service.ExtractingFilesService;
import by.iharantanovich.thefirstservernew.service.FileTypeIdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class FileUploadController {

    private final ExtractingFilesService extractingFilesService;
    private final FileTypeIdentificationService fileTypeIdentificationService;

    @Autowired
    public FileUploadController(ExtractingFilesService extractingFilesService,
                                FileTypeIdentificationService fileTypeIdentificationService) {
        this.extractingFilesService = extractingFilesService;
        this.fileTypeIdentificationService = fileTypeIdentificationService;
    }

    @GetMapping("/upload")
    private String showUploadPage() {
        return "upload_view";
    }

    @PostMapping("/upload")
    private String uploadFile(@RequestParam("file") MultipartFile multipartFile, Model model) {
        if (multipartFile.isEmpty()) {
            model.addAttribute("fileIsEmpty", "You have not selected a file... Try again");
        } else {
            model.addAttribute("successful", "Successfully uploaded file: " + multipartFile.getOriginalFilename() + "!");
            List<File> files = extractingFilesService.extractFiles(multipartFile);
            fileTypeIdentificationService.identityFileType(files);
        }
        return "upload_status_view";
    }
}
