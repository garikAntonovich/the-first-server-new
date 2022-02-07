package by.iharantanovich.thefirstservernew.controller;

import by.iharantanovich.thefirstservernew.service.ExtractingFilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

    private final ExtractingFilesService extractingFilesService;

    @Autowired
    public FileUploadController(ExtractingFilesService extractingFilesService) {
        this.extractingFilesService = extractingFilesService;
    }

    @GetMapping("/upload")
    private String showUploadPage() {
        return "upload_view";
    }

    @PostMapping("/upload")
    private String uploadFile(@RequestParam("file") MultipartFile file, Model model) {
        if (file.isEmpty()) {
            model.addAttribute("fileIsEmpty", "You have not selected a file... Try again");
        } else {
            model.addAttribute("successful", "Successfully uploaded file: " + file.getOriginalFilename() + "!");
            extractingFilesService.extractFiles(file);
        }
        return "upload_status_view";
    }
}
