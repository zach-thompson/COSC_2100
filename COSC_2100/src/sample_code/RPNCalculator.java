package sample_code;

import sample_code.Operator;

public class RPNCalculator {

	public static float operation(float operand_1, float operand_2, Operator operator) {
		float result = 0;

		switch (operator) {
		case add:
			result = operand_1 + operand_2;
			break;
		case subtract:
			result = operand_1 - operand_2;
			break;
		case multiply:
			result = operand_1 * operand_2;
			break;
		case divide:
			result = operand_1 / operand_2;
		}
		return result;
	}
}
