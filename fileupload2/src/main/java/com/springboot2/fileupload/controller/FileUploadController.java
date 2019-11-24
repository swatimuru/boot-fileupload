package com.springboot2.fileupload.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	public static String uploadDirectory = System.getProperty("user.dir")+"/uploads";
	
	@RequestMapping("/")
	public String uploadView(Model model) {
		return "uploadview";
	}
	
	@RequestMapping("/upload")
	public String uploadFiles(Model model, @RequestParam MultipartFile[] files ) {
		StringBuilder filenames = new StringBuilder();
		
		for(MultipartFile file : files) {
			Path path = Paths.get(uploadDirectory, file.getOriginalFilename());
			filenames.append(file.getOriginalFilename() + " ");
			
			try {
				Files.write(path, file.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		model.addAttribute("msg", "Succesfully uploaded files " + filenames.toString());
		return "uploadstatusview";
	}
	
}

	