
/**
 *
 *  Abstract Class and Abstract Methods
 * */
public class Main {

	public static void main(String[] args) {

//		new Animal();   // Not Allowed. Cannot create objects of abstract class.

		Animal animal;  // Allowed. You can create reference of abstract class.

		Animal animal1 = new Dog();  // Parent class reference --> Child class object
		animal1.eat();
		animal1.run();
	}
}

abstract class Animal {

	public void run() {
		System.out.println("Animal is running");
	}

	abstract public void eat();

}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
}

/*
 *   Rules for abstract keyword:
 *       1. abstract class:
 *           * A class that is declared abstract
 *           * You cannot create object of abstract class
 *           * It may or may not contain abstract methods
 *
 *       2. abstract method:
 *           * No method body. You cannot write code in abstract method.
 *           * It is mandatory to override the abstract method in child class.
 * */
