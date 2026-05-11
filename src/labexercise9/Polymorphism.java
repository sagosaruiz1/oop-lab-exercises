package labexercise9;

import java.util.Scanner;

// BASE CLASS
class Calculate {

	public void area() {
		System.out.print("The formula for area of ");

	}
}

// SUBCLASSES
class Circle extends Calculate {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		super.area();
		System.out.println("Circle");
		double result = Math.PI * Math.pow(radius, 2);
		System.out.println("The area of a circle is " + result);
	}
}

class Square extends Calculate {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public void area() {
		super.area();
		System.out.println("Square");
		double result = side * side;
		System.out.println("The area of a square is  " + result);
	}

}

class Triangle extends Calculate {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void area() {
		super.area();
		System.out.println("Triangle");
		double result = (base * height) / 2;
		System.out.println("The area of a triangle is " + result);
	}
}

// MAIN
public class Polymorphism {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		char isTryAgain;

		do {
			System.out.println("-----Choose which shape you want to Calculate the area of-----");
			System.out.println("1. Circle");
			System.out.println("2. Square");
			System.out.println("3. Triangle");

			System.out.print("Choice: ");
			int choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.println("---Calculate the area of a Circle---");
				System.out.print("enter the radius of a circle: ");
				double radius = input.nextDouble();
				Circle circle = new Circle(radius);
				circle.area();
				break;
			case 2:
				System.out.println("---Calculate the area of a Square---");
				System.out.print("enter the side of a square: ");
				double side = input.nextDouble();
				Square square = new Square(side);
				square.area();
				break;
			case 3:
				System.out.println("---Calculate the area of a Triangle---");
				System.out.println("enter the base and height of a triangle:");
				System.out.print("Base: ");
				double base = input.nextDouble();
				System.out.print("Height: ");
				double height = input.nextDouble();
				Triangle triangle = new Triangle(base, height);
				triangle.area();
				break;
			default:
				System.out.println("enter a valid number choice.");
			}

			System.out.println("Do you want to continue: (y/n): ");
			isTryAgain = input.next().charAt(0);

		} while (isTryAgain == 'y' || isTryAgain == 'Y');
		
		System.out.print("BYEE!!");

		input.close();

	}

}
