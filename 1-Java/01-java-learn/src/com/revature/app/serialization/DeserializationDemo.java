package com.revature.app.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializationDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			List<Person> personList = (ArrayList) objectInutStream.readObject();
		}

	}

}
