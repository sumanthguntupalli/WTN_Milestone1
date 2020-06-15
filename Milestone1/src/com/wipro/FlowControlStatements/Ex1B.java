package com.wipro.FlowControlStatements;
import java.util.*;
public class Ex1B {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a%10==b%10)
		System.out.println("true");
	else
		System.out.println("false");
}
}
