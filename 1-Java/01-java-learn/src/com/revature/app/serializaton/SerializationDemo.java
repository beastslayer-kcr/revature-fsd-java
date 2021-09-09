package com.revature.app.serializaton;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.app.collection.Person;

public class SerializationDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Person person1 = new Person("John", 15);
		Person person2 = new Person("Smith", 25);
		Person person3 = new Person("Stella", 32);
		Person person4 = new Person("Maria", 42);
		Person person5 = new Person("Maria", 42);
		Person person6 = new Person("Mark", 13);
		
		// Maintains the insertion order
		// Duplicate items
		List<Person> personList = new ArrayList<>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		personList.add(person5);
		personList.add(person6);
		
		
		FileOutputStream fileOutputStream  = new FileOutputStream("E:\\revature-fsd-java-30-aug-2021\\revature-fsd-java\\1-Java\\01-java-learn\\2.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(personList);
		
		objectOutputStream.close();
		fileOutputStream.close();
		
	}

}
