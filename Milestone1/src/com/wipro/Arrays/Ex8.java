package com.wipro.Arrays;

import java.util.*;
public class Ex8 {
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
	int sum=0,su=0;
	for (int i=0;i<n;i++)
	{
			//System.out.println("a         "+a[i]);
			sum+=a[i];
		if(a[i]==6 && i!=n-1)
		{
			int j=i;
			while(j<n)
			{
			    	//System.out.println("6   "+a[j]);
			    su+=a[j];
				if(a[j]==7)
				break;
				j++;
			}
				
		}
	}
	//System.out.println(su);
	System.out.println(sum-su);
	}

}
