package com.wipro.FlowControlStatements;

import java.util.Scanner;
public class Ex17 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		int rev=0;
		int n=number;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(number==rev)
		System.out.println(number+" is a palindrome");
		else
			System.out.println(number+" is not a palindrome");
	}

}
