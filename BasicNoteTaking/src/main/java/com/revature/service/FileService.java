package com.revature.service;

import com.revature.exceptions.BusinessException;

public interface FileService {

	void write(String newNotes);

	String read() throws BusinessException;
	
	void delete();
}