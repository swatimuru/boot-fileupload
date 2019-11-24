package com.springboot2.fileupload;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot2.fileupload.controller.FileUploadController;

@SpringBootApplication
public class Fileupload2Application {

	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(Fileupload2Application.class, args);
	}

}
