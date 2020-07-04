package com.wipro.Exceptions;
import java.util.*;
class InvalidAge extends Exception
{
	InvalidAge()
	{
		System.out.println("User age must be in rage of 18 to 60");
	}
}
public class Ex5 {
	static void registerUser(String userName,int Age) throws InvalidAge
	{
		String name;
		int age;
		name=userName;
		try {
		if(Age >=18 && Age<=60)
		{
			age =Age;
		}
		else throw new InvalidAge();
		System.out.println("User Registration Successfull");
		}
		catch (InvalidAge e)
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) throws InvalidAge {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name");
		String name=sc.nextLine();
		System.out.println("enter user country");
		int a=sc.nextInt();
		registerUser(name,a);
		
	}

}
