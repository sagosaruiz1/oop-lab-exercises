package labExercise;

import java.util.Scanner;

public class Operations {

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int product(int a, int b) {
		return a * b;
	}

	public static int difference(int a, int b) {
		return a - b;
	}

	public static int quotient(int a, int b) {
		return a/ b;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char choice;
		
		do {
			System.out.println("Enter first number: ");
			int num1 = input.nextInt();
			
			System.out.println("Enter second number: ");
			int num2 = input.nextInt();
			
			System.out.println("\n---Choose which operation you want to use---");
			System.out.println("\n1. Sum");
			System.out.println("\n2. Product");
			System.out.println("\n3. Difference");
			System.out.println("\n4. Quotient");
			
			System.out.println("\nChoice: ");
			int operation = input.nextInt();
			
			System.out.println("--Result--\n");
			
			switch(operation) {
			case 1:
				System.out.println("Sum: " + sum(num1, num2));
				break;
			case 2:
				System.out.println("Product: " + product(num1, num2));
				break;
			case 3:
				System.out.println("Difference: " + difference(num1, num2));
				break;
			case 4:
				System.out.println("Quotient: " + quotient(num1, num2));
				break;
				
			default:
				System.out.println("Invalid Choice");
			}
			
			System.out.println("Do you want to continue: (y/n): ");
			choice = input.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
		
		input.close();
	}

}
