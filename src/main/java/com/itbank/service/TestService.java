package com.itbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.TestDAO;

@Service
public class TestService {
	
	@Autowired private TestDAO dao;

	public String getTest() {
//		return "서현씨 다 됐나요?";
		return dao.selectVersion();
	}

}
