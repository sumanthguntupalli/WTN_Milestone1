package com.wipro.Arrays;
import java.util.*;
public class Ex13 {
	public static void main(String[] args) {
		int a[][]=new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements");
		for(int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for (int i=1;i>=0;i--)
		{
			for(int j=1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
