package com.revature.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.revature.exceptions.BusinessException;

// Our service layer logic should never communicate directly to our user
public class FileServiceImpl implements FileService {

	public static final String FILENAME = "./default.txt";
	
	@Override
	public void write(String notes) {
		
		BufferedWriter writer;
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
			String line = reader.readLine();
			writer = new BufferedWriter(new FileWriter(FILENAME));
			writer.write("***");
			writer.write(notes);
			writer.write("***");
			writer.write(line);
			writer.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String read() throws BusinessException {
		String line = ""; // Start with an empty string
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
			
			
			while(((line = reader.readLine())).length() != line.length()) {
				//Our  checking condition is going to see if there string stops getting bigger!
				
				//keep reading until we find an empty line
				
			}
			
		}catch(FileNotFoundException e) {
			throw new BusinessException("File was not initalized");
		}catch(IOException e) {
			e.printStackTrace();
		}
		return line;

	}
	@Override
	public void delete() {
		
		BufferedWriter writer;
		
		
		try {			
			writer = new BufferedWriter(new FileWriter(FILENAME));
			writer.write(" ");
			writer.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	

}
