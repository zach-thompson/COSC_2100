package sample_code;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float temp_result = 0;
		float result = 0;
		String command = " ";

		do {
			System.out.print("Enter two numbers: ");
			float operand_1 = scan.nextInt();
			float operand_2 = scan.nextInt();

			System.out.println("Enter an operation (+, -, *, /): ");
			String operator = scan.nextLine();

			switch (operator) {
			case "+":
				temp_result = RPNCalculator.operation(operand_1, operand_2, Operator.add);
				break;
			case "-":
				temp_result = RPNCalculator.operation(operand_1, operand_2, Operator.subtract);
				break;
			case "multiply":
				temp_result = RPNCalculator.operation(operand_1, operand_2, Operator.multiply);
				break;
			case "divide":
				temp_result = RPNCalculator.operation(operand_1, operand_2, Operator.divide);
				break;
			}
			result += temp_result;
			System.out.print(result);

			System.out.println("Would you like to peek or stop: ");
			command = scan.nextLine();

			if (command == "peek") {
				System.out.print(result);
			}

		} while (command != "stop");

		scan.close();
		return;
	}

}
