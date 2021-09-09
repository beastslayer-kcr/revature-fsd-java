package com.revature.app.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo {

	public static void main(String[] args) {
		Integer age = 10;
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		for(int number : arrayList) {
			System.out.println(number);
		}
		Collections.sort(arrayList);
		for(int number : arrayList) {
			System.out.println(number);
		}
		System.out.println("number");
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
	}

}
