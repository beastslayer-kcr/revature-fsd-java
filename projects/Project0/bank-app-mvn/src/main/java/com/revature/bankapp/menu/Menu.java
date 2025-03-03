package com.revature.bankapp.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.bankapp.main.BankApp;

public abstract class Menu {

	protected String name;
	protected List<String> menuItems;
	protected int selection;

	public Menu(String name) {
		this.name = name;
		menuItems = new ArrayList<String>();
		// this.selection = selection;
	}

	public void addMenuItem(String menuItemName) {
		menuItems.add(menuItemName);
	}

	public void displayMenu() {
		System.out.println("-----------------");
		System.out.println(name);
		System.out.println("-----------------");
		for (int i = 0; i < menuItems.size(); i++) {
			System.out.println((i + 1) + "]  " + menuItems.get(i));
		}
		System.out.println("Choose the option: ");

	}

	public void captureSelection() {
		Scanner scanner = BankApp.getScanner();
		selection = Integer.parseInt(scanner.next());

	}

	public void displayMenuAndCaptureSelection() {
		displayMenu();
		captureSelection();
		handleAction();
	}

	abstract void handleAction();
}
