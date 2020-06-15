package com.wipro.FlowControlStatements;
import java.util.*;
public class Ex7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a characters");
		char ch1=sc.next().charAt(0);
		if(ch1>='a'&&ch1<='z')
			System.out.println(ch1+" -> "+Character.toUpperCase(ch1));
		else
			System.out.println(ch1+" -> "+Character.toLowerCase(ch1));
	}
}
