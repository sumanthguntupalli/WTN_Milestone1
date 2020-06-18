package com.wipro.Arrays;
import java.util.*;
public class Ex2 {
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
	System.out.println("Max: "+a[n-1]+" min: "+a[0]);
}
}
