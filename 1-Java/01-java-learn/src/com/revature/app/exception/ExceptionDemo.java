package com.revature.app.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

//import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int age = scanner.nextInt(); // unchacked exception
			System.out.println(age);
		} catch (InputMismatchException e) {
			System.out.println("Enter Valid age");
		}
		System.out.println("After catch block.");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		try {
			System.out.println(sdf.parse("01/01/2021aaaa"));
		} catch (ParseException e) {						//chacked exception
			System.out.println("Enter date in dd/mm/yy format.");
		}
	}
	public void methodThrowingException(int age) throws CustomeException {
			if( age < 0) {
				throw new CustomeException("age can't be negative.");
			}
		
		System.out.println("Method processing....");
	}
}

