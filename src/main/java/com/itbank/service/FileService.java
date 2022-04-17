package com.itbank.service;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class FileService {

	private String url = "D://upload";
	private File dir;
	
	//날자를 붙여서 출력하고 싶다 -> 날자 형태를 만들고 -> 그걸 갖다 붙이고 -> dto.getfileUp.transto(Filename)으로 바꾼다 
	// DB에서는 파일이름만 읽어올 수 있다
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	
	 
}
