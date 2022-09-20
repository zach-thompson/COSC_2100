package assignment_1;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.*;

/*
* COSC_2100 - Fall 2022
* Assignment_1 (Due 9/21/22)
* Description: 
* Author: Zach Thompson
*/

public class main {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Zach's login simulator\n");
		
		FileWriter writeData = new FileWriter("userData.txt", true);
		File userData = new File ("userData.txt");
		
		switch (getUserType()) { // calls getUserType which returns a 1 or 2
		case 1:
			login(userData);
			break;
		case 2:
			newUser(writeData, userData);
			break;
		}
		
		writeData.close();
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
	
	public static void login(File userData) {
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
		
		boolean match = false;
		String temp = null;
		while (match == false) {
			System.out.print("Username: ");
			String username = scan.next();
			read.reset();
			innerloop:
			try {
			while(read.hasNextLine() == true) {
				temp = read.next();
				if (temp.contains(username)) {
					break innerloop;
					}
				}
			} catch (NoSuchElementException e) { System.out.println("Bounds exception"); }
			
			System.out.print("Password: ");
			String password = scan.next();
			temp = read.next();
			if (temp.contains(password)) {
				match = true;
				break;
			}
			else {
				System.out.println("Username and password don't match. Please try again.\n");
			}
		}
			
		System.out.println("Login successful!");
		scan.close();
		read.close();
	}

	public static void newUser(FileWriter writeData, File userData) throws Exception {
		PrintWriter out = new PrintWriter(userData);
		Scanner read = new Scanner(userData);
		boolean registered = false;
		
		while (registered == false) {
			System.out.print("Username: ");
			String username = scan.next();
			
			if (userData.length() == 0) {
				out.print(username + " ");
				break;
			}
			innerloop:
			while (scan.hasNextLine()) {
				String temp_user = read.next();		
				if (temp_user == username) {
					System.out.println("Username already exists, please try again.\n");
					break innerloop;
				}
				else { out.print(username + " "); }
			}
		}
		
		System.out.print("Password: ");
		String password = scan.next();
		out.println(password);
		System.out.print("Registration successful!");
	
		read.close();
		scan.close();
		out.close();
	}
}
