
package com.revature.bankapp.menu;

import java.util.Scanner;

public class CustomerMainMenu extends Menu {

	public CustomerMainMenu(String name) {
		super(name);
		addMenuItem("Create new account");
		addMenuItem("View Accounts");
		addMenuItem("Logout");
		
	}
	
	@Override
	void handleAction() {
		Scanner in  = new Scanner(System.in);
		
		switch(selection) {
			case  1:
		}
	}

}
