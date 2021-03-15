package com.class13;

public class Dog {
	public String breed;
	public String size;
	public String color;
	public int age;

	public void bark() {
		System.out.println("GAV GAV");

	}

	public void sleep() {
		System.out.println("zzzzzzzzzzzzzz");

	}

	public void eat() {
		System.out.println("Chavkaet!!!!!");
	}

	public void look() {
		System.out.println(" Hi I am a dog my color is " + color);

	}

	public static void main(String[] args) {
		Dog bullDog = new Dog();
		bullDog.age = 5;
		bullDog.breed = "American Buldog";
		bullDog.size = "Large";
		bullDog.color = "Pink";
		bullDog.bark();
		bullDog.sleep();
		bullDog.eat();
		bullDog.look();

		Dog beagle = new Dog();
		beagle.age = 4;
		beagle.breed = "beagle";
		beagle.size = "Large";
		beagle.color = "light brown";
		beagle.look();

	}

}
