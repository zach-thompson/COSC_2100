package assignment_1;

/*
* COSC_2100 - Fall 2022
* Assignment_1 (Due 9/21/22)
* Description: 
* Author: Zach Thompson
*/

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		
		while (!(input == 1 || input == 2)) {
			System.out.print("Enter 1 for existing user - Enter 2 to create a new user: ");
			if (!scan.hasNextInt()) {
				System.out.println("Invalid response\n");
				scan.nextLine();
			}
			else {
				input = scan.nextInt();
				if (!(input == 1 | input == 2)) {
					System.out.println("Invalid response\n");
				}
			}
		}
		
		System.out.println("You entered: " + input);
		
		scan.close();
		return;
	}

}
