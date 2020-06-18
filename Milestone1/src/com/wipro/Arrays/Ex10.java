package com.wipro.Arrays;
import java.util.*;
public class Ex10 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter n value");
	int n=sc.nextInt();
	System.out.println("enter array elements");
	int a[]=new int[n];
	int b[] = new int[n];
	for (int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int c=0;
	for (int i=0;i<n;i++)
	{
		if(a[i]%2==0)
		{
			b[c]=a[i];
			c++;
		}
		
	}
	for (int i=0;i<n;i++)
	{
		if(a[i]%2!=0)
		{
			b[c]=a[i];
			c++;
		}
		
	}
	for (int i=0;i<n;i++)
		System.out.println(b[i]);
	
}
}
