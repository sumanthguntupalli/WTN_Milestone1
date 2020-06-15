package com.wipro.FlowControlStatements;
import java.util.*;
public class Ex1A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number =sc.nextInt();
		if(number>0)
			System.out.println("positive number");
		else if(number<0)
			System.out.println("negetive number");
		else
			System.out.println("Zero");	
	}
}
