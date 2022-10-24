package assignment_2;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		// create empty stack
		//NewLinkedStack<T> stack = new NewLinkedStack();
		
		int numElements = getNum();
		for(int i = 0; i < numElements; i++) {
			// fill stack with random values
			//stack.push(random.nextInt(1000));
			System.out.println(random.nextInt(1000));
		}

	}
	
	public static int getNum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the desired number of elements: ");
		int num = scan.nextInt();
		scan.close();
		return num;
	}

}
