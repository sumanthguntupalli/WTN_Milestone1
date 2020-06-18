package com.wipro.Arrays;
import java.util.*;
public class Ex14 {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter 9 elements");
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int max=0;
		System.out.println("The given array");
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(a[i][j]>max)
					max=a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The biggest number in the given array is "+max);
	}

}
