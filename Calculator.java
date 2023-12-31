package calcPackage;
import java.util.Scanner; 

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter first number: "); 
		double firstNum = input.nextDouble(); 
		System.out.println("Enter second number: "); 
		double secondNum = input.nextDouble();
		
		System.out.println("Enter operation (+, -, *, /, %, ^): "); 
		char operation = input.next().charAt(0); 
		
		double result = 0.00; 
		
		if (operation == '+') {
			result = firstNum + secondNum; 
		} else if (operation == '-') {
			result = firstNum - secondNum; 
		} else if (operation == '*') {
			result = firstNum * secondNum; 
		} else if (operation == '/') {
			result = firstNum / secondNum; 
		} else if (operation == '%') {
			result = firstNum % secondNum; 
		} else if (operation == '^') {
			result = Math.pow(firstNum, secondNum); 
		} else {
			System.out.println("Wrong operation");
		}
		
		System.out.println(firstNum + " " + operation + " " + secondNum + " = " + result); 
	}

}
