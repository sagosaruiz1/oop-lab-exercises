package labExercise;

import java.util.Scanner;

public class ValueDeterminator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		int number;
		int highest = 0;
		int lowest = 0;
		
		do {
			if (count == 1)
				System.out.print("Enter 1st number: ");
			else if (count == 2)
				System.out.print("Enter 2nd number: ");
			else if (count == 3)
				System.out.print("Enter 3rd number: ");
			else if (count == 4)
				System.out.print("Enter 4th number: ");
			else if (count == 5)
				System.out.print("Enter 5th number: ");
			
			number = sc.nextInt();
			
			if (count == 1) {
				highest = number;
				lowest = number;
			} else if (number > highest) {
				highest = number;
			} else if (number < lowest) {
				lowest = number;
			}
			
			count++;
				
				
		} while (count <= 5);
			
			System.out.println();
			System.out.println("The highest value is: " + highest);
			System.out.println("The lowest value is: " + lowest);
			
			sc.close();
		
	}

}
