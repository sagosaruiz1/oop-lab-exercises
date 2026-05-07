package labExercises;


class Fruit {
	
	void say() {
		System.out.println("This is a fruit!..");
	}
}

class Apple extends Fruit {
	void eat() {
		System.out.println("This apple is delicious!..");
	}
}

class Orange extends Fruit {
	void taste() {
		System.out.println("This orange is sweet!..");
	}
}

class Mango extends Fruit {
	void slice() {
		System.out.println("This mango is also sweet!..");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		Apple apple = new Apple();
		Orange orange = new Orange();
		Mango mango = new Mango();
		
		System.out.println("-----Calling Apple Method-----");
		apple.say();
		apple.eat();
		
		System.out.println("\n-----Calling Orange Method-----");
		orange.say();
		orange.taste();
		
		System.out.println("\n-----Calling Mango Method-----");
		mango.say();
		mango.slice();
	}

}
