package labexercise7;

import java.util.Scanner;


class Triangle {
	
	private float base;
	private float height;
	
	public void setBase(float base) {
		this.base = base;
	} 
	
	public float getBase() {
		return base; 
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getHeight() {
		return height;
	}
	
	public float areaCalculator() {
		return (base * height) / 2;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String answer;
		
		do {	
			Triangle triangle = new Triangle();
			
			System.out.println("Please enter the base: ");
			int getbase = scanner.nextInt();
			triangle.setBase(getbase);
			
			System.out.println("Please enter the height: ");
			int getheight = scanner.nextInt();
			triangle.setHeight(getheight);
			
			System.out.println("The are of a tringle is: " + (int)triangle.areaCalculator());
			
			scanner.nextLine();
			
			System.out.println("do you want to try again?: (y/n)");
			answer = scanner.nextLine();
			
		} while (answer.equalsIgnoreCase("y"));
		System.out.println("Bye!");
		scanner.close();
	}
}
