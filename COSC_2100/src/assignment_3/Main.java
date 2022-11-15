package assignment_3;
import java.util.Scanner;

/*
* COSC 2100 – Fall’22 
* Assignment#4 
* Description: 
* Author: Zach Thompson
*/

public class Main {

	public static void main(String[] args) {
		DEQueue<String> myQ = new DEQueue<String>();
		
		/* System.out.println("Add elements to queue");
		myQ.enqueueFront(4);
		myQ.enqueueFront(3);
		myQ.enqueueFront(2);
		System.out.println(myQ.toString());
		
		System.out.println("\nTest enqueueRear()");
		myQ.enqueueRear(5);
		System.out.println(myQ.toString());
		
		System.out.println("\nTest enqueueFront()");
		myQ.enqueueFront(1);
		System.out.println(myQ.toString());
		
		System.out.println("\nTest dequeueRear()");
		myQ.dequeueRear();
		System.out.println(myQ.toString());
		
		System.out.println("\nTest dequeueFront()");
		myQ.dequeueFront();
		System.out.println(myQ.toString()); */
		
		String x;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("1 - enqueueFront\n2 - enqueueRear\n3 - dequeueFront\n4 - dequeueRear\n5 - Quit");
			System.out.print("Please select a function from the list above: ");
			x = scan.next();
			
			switch (x) {
			case "1":
				System.out.print("Input: ");
				if (myQ.size() >= 5) {
					myQ.dequeueRear();
					myQ.enqueueFront(scan.next());
					System.out.println("Queue: " + myQ.toString() + "\n");
					break;
				}
				else {
					myQ.enqueueFront(scan.next());
					System.out.println("Queue: " + myQ.toString() + "\n");
					break;
				}
				
			case "2":
				System.out.print("Input: ");
				if (myQ.size() >= 5) {
					myQ.dequeueRear();
					myQ.enqueueRear(scan.next());
					System.out.println("Queue: " + myQ.toString() + "\n");
					break;
				}
				else {
					myQ.enqueueRear(scan.next());
					System.out.println("Queue: " + myQ.toString() + "\n");
					break;
				}
				
			case "3":
				myQ.dequeueFront();
				System.out.println(myQ.toString() + "\n");
				break;
				
			case "4":
				myQ.dequeueRear();
				System.out.println(myQ.toString() + "\n");
				break;
				
			case "5":
				System.out.println("Final queue: " + myQ.toString());
				scan.close();
				return;
			}
		} while (true);
	}
}
