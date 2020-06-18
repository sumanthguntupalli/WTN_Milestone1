package com.wipro.Arrays;
import java.util.*;
public class Ex7 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter total numbers elements");
	int n=sc.nextInt();
	int []a=new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("enter "+(i+1)+"elements");
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for (int i=0;i<n-1;i++)
	{
		if(a[i]!=a[i+1])
			System.out.println(a[i]);
	}
	if(a[n-2]!=a[n-1])
		System.out.println(a[n-1]);
	}

}
