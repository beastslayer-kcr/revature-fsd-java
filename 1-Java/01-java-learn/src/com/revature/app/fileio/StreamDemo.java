package com.revature.app.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class StreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream reader = new FileInputStream("C:\\Users\\KRISHNA CHANDRA RAI\\Desktop\\pics\\1.jpg");
		FileOutputStream writer = new FileOutputStream("C:\\\\Users\\\\KRISHNA CHANDRA RAI\\\\Desktop\\\\pics\\\\2.jpg");
		
		int character = reader.read();
		
		while( character != -1) {
			
			System.out.print((char) character);
			writer.write(character);
			character = reader.read();
		}

		reader.close();
		writer.close();
	}

}