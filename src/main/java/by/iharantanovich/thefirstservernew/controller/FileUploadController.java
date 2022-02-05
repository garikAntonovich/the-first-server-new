package by.iharantanovich.thefirstservernew.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FileUploadController {

    @GetMapping("/upload")
    private String uploadPage() {
        return "upload_view";
    }
}
