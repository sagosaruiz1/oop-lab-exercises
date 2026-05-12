package labexercise4;

import java.util.Scanner;

public class NumberToWords {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;

		do {
			System.out.println("Enter the size of the array: ");
			number = input.nextInt();

			if (number <= 0 || number > 100)
				System.out.println("Please enter a positive integer between 1 and 100.");
		} while (number <= 0 || number > 100);

		int[] numbers = new int[number];

		for (int i = 0; i < number; i++) {
			System.out.print("Array element " + (i + 1) + ": ");
			numbers[i] = input.nextInt();
		}

		String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourtheen", "fifteen", "seventeen", "eighteen", "nineteen" };

		String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		System.out.println("------------------------------");
		System.out.println("Array in words are: ");
		for (int i = 0; i < number; i++) {
			int num = numbers[i];
			String word;
			if (num <= 20)
				word = words[num];
			else if (num < 100) {
				int tenPart = num / 10;
				int unitPart = num % 10;
				
				if (unitPart == 0)
					word = tens[tenPart];
				else
					word = tens[tenPart] + " " + words[unitPart];
			}
			else
				word = "Number out of range";
			
			System.out.println("Array element " + (i + 1) + ": " + word);
			input.close();
			
			
			
		}

	}

}
