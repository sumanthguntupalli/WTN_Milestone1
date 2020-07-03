package com.wipro.Exceptions;
import java.util.*;
public class Ex1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in the array");
	int n=sc.nextInt();
	System.out.println("Enter the elements in the array");
	int a[]=new int[n];
	try {
	for(int i=0;i<n;i++)
	{
		String s=sc.next();
		a[i]=Integer.parseInt(s);
	}
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	System.out.println("Enter the index of the array elements in the array");
	int i=sc.nextInt();
	try
	{
		System.out.println("the array index at "+i+":"+a[i]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
}
}
