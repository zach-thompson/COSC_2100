package assignment_2;
import java.util.Scanner;
import java.util.Random;

/*
 * COSC 2100 - Fall '22
 * Assignment #2
 * Author: Zach Thompson
 * Description: Prompts user for a number - Randomly fills a linked stack with that number of integers from 1-1000
 * Returns the highest value in the stack by repeatedly comparing the top and bottom values in the stack and removing the lesser
 */

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		NewLinkedStack<Integer> myStack = new NewLinkedStack<Integer>();
		
		int numElements = getNum(); // gets user input for number of objects in stack
		if (numElements <=  0) {	// basic error checking
			System.out.println("Not a valid number.");
			return;
		}
		
		// loop to fill stack with desired number of random integers
		for(int i = 0; i <= numElements; i++) {
			myStack.push(random.nextInt(1000));
		}
		
		System.out.println(myStack); // print stack
		System.out.println("Highest value: " + getMax(myStack));	// print largest element in stack
		return;
	}
	
	// Method that takes in user input to return variable of the desired value
	public static int getNum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the desired number of elements: ");
		int num = scan.nextInt();
		scan.close();
		return num;
	}
	
	// Method that returns that highest value object in a given linked stack
	public static int getMax(NewLinkedStack<Integer> input) {
		while(input.size() > 1) {
			if (input.top() >= input.bottom()) {
				input.popFromBottom();
			}
			else {
				input.pop();
			}
		}
		return (Integer) input.top.getInfo();
	}
}
