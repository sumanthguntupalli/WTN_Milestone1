package com.wipro.FlowControlStatements;
import java.util.*;
public class Ex15 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	for (int i=0;i<n;i++)
	{
		for (int j=0;j<=i;j++)
		System.out.print("* ");
		System.out.println();
	}
}
}
