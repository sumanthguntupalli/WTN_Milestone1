package com.wipro.Inheritance;
class Animal{
	void eat()
	{
		System.out.println("Animal eating");
	}
	void sleep()
	{
		System.out.println("Animal is sleeping");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("bird is eating");
	}
	void sleep()
	{
		System.out.println("bird is sleeping");
	}
	void fly()
	{
		System.out.println("bird will fly");
	}
}
public class Ex1 {
	public static void main(String[] args) {
		Animal a= new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.fly();
		b.sleep();
	}

}
