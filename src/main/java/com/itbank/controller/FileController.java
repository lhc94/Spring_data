package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.FileDTO;
import com.itbank.service.FileService;

@Controller
public class FileController {

	@Autowired FileService fs;
	
	@GetMapping("/file")
	public void file() {}
	
	@PostMapping("/file")
	public ModelAndView file(FileDTO dto) {
		ModelAndView mav = new ModelAndView();
		System.out.println(dto.getName());
		System.out.println(dto.getAge());
		System.out.println(dto.getFileName());
		System.out.println(dto.getFileUp());
		
		return mav;
	}
	
}
