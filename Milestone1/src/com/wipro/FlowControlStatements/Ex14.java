package com.wipro.FlowControlStatements;
import java.util.*;
public class Ex14 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum+=r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
