package com.wipro.Arrays;
import java.util.*;
public class Ex9 {
public static void main(String[] args) {
	System.out.println("enter n value");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int [] a=new int[n];
	System.out.println("enter array elements");
	int c=0;
	for (int i=0;i<n;i++)
	{
		int w=sc.nextInt();
		if(w!=10) {
			a[c]=w;
			c++;
		}
	}
	for(int i=0;i<n;i++)
		System.out.println(a[i]);
}
}
