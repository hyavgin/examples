package com.revature.examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class assignment {
	
	public static void readCharacterStream(String filename) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line = ""; //start with an empty string
			
			
			while((line = reader.readLine()) != null) { //keep reading until we find an empty line
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public static void writeCharacterStream(String filename) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type something: ");
		
		
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(filename));
		
			writer.write(sc.nextLine());
			//writer.write("Buffered streams allow us to write a lot at a time");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public static void main(String[] args) {
		//String filename1 = sc.nextLine();
		String filename = "./Example.txt";
		writeCharacterStream(filename);
		readCharacterStream(filename);
		
		
		autocantication as = new autocantication();
		
	}

}
