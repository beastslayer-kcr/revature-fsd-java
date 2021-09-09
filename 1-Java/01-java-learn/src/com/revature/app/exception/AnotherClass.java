package com.revature.app.exception;

public class AnotherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo demo = new ExceptionDemo();
		try {
			demo.methodThrowingException(10);
		} catch (CustomeException e) {
			System.out.println(e.getMessage()); //implemented inside parent
		}
	}

}
