package assignment_1;

import java.util.Scanner;
import java.io.*;

/*
* COSC_2100 - Fall 2022
* Assignment_1 (Due 9/21/22)
* Description: 
* Author: Zach Thompson
*/

public class main {
	public static Scanner scan = new Scanner(System.in); // initialize global scanner for all methods

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Zach's login simulator\n");
		
		FileWriter file = new FileWriter("userData.txt", true); // initialize FileWriter to create file with append permissions
		
		switch (getUserType()) { // calls getUserType which returns a 1 or 2
		case 1:
			login(); // calls login function
			break;
		case 2:
			newUser(file); // calls newUser function, passing the log file as an argument
			break;
		}
		
		scan.close();
		return;
	}
	
	public static int getUserType() { // reads and error checks user input
		int input = 0;
		
		while (!(input == 1 || input == 2)) {
			System.out.print("Enter 1 to log in as an existing user - Enter 2 to create a new user: ");
			if (!scan.hasNextInt()) {
				System.out.println("Invalid response, please try again.\n");
				scan.next();
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
	
	public static void login() throws FileNotFoundException {
		File userData = new File("userData.txt");
		Scanner read = null;
		try {
			read = new Scanner(userData);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		}
		
		if (userData.length() == 0) {
			System.out.println("Please create an account before logging in.");
			return;
		}
		
		String temp = null;
		while (read.hasNext()) {
			System.out.print("Username: ");
			String username = scan.next();
			
			while(read.hasNext()) {
				temp = read.nextLine();
				
				if (temp.contains(username)) {
					System.out.print("Password: ");
					String password = scan.next();
					
					if (temp.contains(password)) {
						System.out.println("Login successful!");
						read.close();
						return;
					}
					else {
						System.out.println("Username and password don't match. Please try again.\n");
						read.close();
						return;
					}
				}
				else {
					System.out.println("Username not found, please try again");
					read.close();
					return;
				}
			}
		}
	}

	public static void newUser(FileWriter file) throws Exception {
		PrintWriter out = new PrintWriter(file);
		File userData = new File("userData.txt");
		Scanner read = new Scanner(userData);
		
		boolean unique = false;
		String username = "";
		String temp_user = "";
		
		while (unique == false) {
			read.reset();
			System.out.print("Username: ");
			username = scan.next();
			
			boolean flag = false;
			if (userData.length() == 0) {
				out.print(username + " ");
				break;
			}
			else { System.out.println(username);
				while (read.hasNext() && flag == false) {
					temp_user = read.nextLine();
					if (temp_user.contains(username)) {
						flag = true;
					}
				}
				if (flag == true) {
					System.out.println("Username already exists, please try again.\n");
				}
				else {
					unique = true;
				}
			}
		}
		
		out.print(username + " ");
		
		System.out.print("Password: ");
		String password = scan.next();
		out.println(password);
		System.out.print("Registration successful!");
	
		read.close();
		out.close();
	}
}
