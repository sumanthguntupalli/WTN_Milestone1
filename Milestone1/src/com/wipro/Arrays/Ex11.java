package com.wipro.Arrays;
import java.util.*;
public class Ex11 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter n value");
	int n=sc.nextInt();
	System.out.println("enter array elements");
	int a[]=new int[n];
	int f=0;
	for (int i=0;i<n;i++)
	{
		int w=sc.nextInt();
		if(w!=1&&w!=4)
		{
			f=1;
			break;
		}
	}
	if(f==1)
		System.out.println("false");
	else
		System.out.println("true");
}
}

	