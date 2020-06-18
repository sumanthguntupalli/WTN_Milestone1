package com.wipro.Arrays;
import java.util.*;
public class Ex5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		for (int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max1=a[0];
		int min1=99999;
		for (int i=0;i<n;i++)
		{
			if(a[i]>max1)
				max1=a[i];
			if(a[i]<min1)
				min1=a[i];
		}
		int max2=min1;
		int min2=max1;
		for (int i=0;i<n;i++)
		{
			if(a[i]<min2 && a[i]!=min1)
				min2=a[i];
			if(a[i]>max2 && a[i]!=max1)
				max2=a[i];
		}
		System.out.println("max1 "+max1+" max2 : "+max2+" min1 "+min1+" min2 : "+min2);
		
	}
	

}
