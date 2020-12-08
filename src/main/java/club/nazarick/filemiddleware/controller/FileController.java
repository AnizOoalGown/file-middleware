package club.nazarick.filemiddleware.controller;

import club.nazarick.filemiddleware.dto.CommonResult;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FileController {

    @PostMapping("/upload")
    public CommonResult<?> upload(@RequestParam MultipartFile file) {
        return null;
    }

    @GetMapping("/download")
    public ResponseEntity<Resource> download(@RequestParam String filename) {
        return null;
    }
}
