package com.wipro.Arrays;
import java.util.*;
public class Ex6 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter total numbers elements");
	int n=sc.nextInt();
	int []a=new int[n];
	float avg;
	int sum=0;
	for(int i=0;i<n;i++)
	{
		System.out.println("enter "+(i+1)+"elements");
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
}
}