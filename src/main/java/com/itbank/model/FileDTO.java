package com.itbank.model;

import org.springframework.web.multipart.MultipartFile;

public class FileDTO {
	private String name, fileName;
	private MultipartFile fileUp;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public MultipartFile getFileUp() {
		return fileUp;
	}
	public void setFileUp(MultipartFile fileUp) {
		this.fileUp = fileUp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
