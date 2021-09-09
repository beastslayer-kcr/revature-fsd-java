package com.revature.app.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileReader reader = new FileReader("E:\\revature-fsd-java-30-aug-2021\\revature-fsd-java\\1-Java\\file.txt");
		FileWriter writer = new FileWriter("E:\\\\revature-fsd-java-30-aug-2021\\\\revature-fsd-java\\\\1-Java\\\\file1.txt");
		
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
