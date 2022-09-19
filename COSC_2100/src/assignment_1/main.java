package assignment_1;

/*
* COSC_2100 - Fall 2022
* Assignment_1 (Due 9/21/22)
* Description: 
* Author: Zach Thompson
*/

import java.util.Scanner;
import java.io.*;

public class main {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Zach's login simulator\n");
		FileWriter userData = new FileWriter("userData.txt");
		
		switch (getUserType()) { // calls getUserType which returns a 1 or 2
		case 1:
			login();
			break;
		case 2:
			newUser();
			break;
		}
		return;
	}
	
	public static int getUserType() {
		int input = 0;
		
		while (!(input == 1 || input == 2)) {
			System.out.print("Enter 1 to log in as an existing user - Enter 2 to create a new user: ");
			if (!scan.hasNextInt()) {
				System.out.println("Invalid response, please try again.\n");
				scan.nextLine();
			}
			else {
				input = scan.nextInt();
				if (!(input == 1 | input == 2)) {
					System.out.println("Please enter one of the provided options.\n");
				}
			}
		}
		return input;
	}
	
	public static void login() {
		// Check for existing user write to file
		System.out.println("Username: ");
		String username = scan.nextLine();
		
		
		
		System.out.println("Password: ");
		String password = scan.nextLine();
		
		System.out.println("Login successful!");
		scan.close();
		return;
	}

	public static void newUser() throws IOException {
		File userData = new File("userData.txt");
		PrintWriter print = new PrintWriter(userData);
		Scanner read = new Scanner(userData);
		
		System.out.println("Enter a username: ");
		String username = scan.next();
		
		//do {
			//if (read.nextLine() == username) {
			//	System.out.println("Username already exists, please try again");
			//}
			//else {
				print.print(username);
			//}
	//	} while (read.hasNextLine());
		
		//System.out.println("Enter a username: ");
		//String password = scan.nextLine();
		
		
		
		System.out.println("New user created!");
		scan.close();
		print.close();
		read.close();
		return;
	}
}
