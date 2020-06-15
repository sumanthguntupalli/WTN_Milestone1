package com.wipro.FlowControlStatements;
import java.util.*;
public class Ex8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a characters");
		char ch1=sc.next().charAt(0);
		switch(ch1)
		{
		case 'R':
			System.out.println("R->Red");
			break;
		case 'B':
			System.out.println("B->Blue");
			break;
		case 'G':
			System.out.println("G->Green");
			break;
		case 'O':
			System.out.println("O->Orange");
			break;
		case 'Y':
			System.out.println("Y->Yellow");
			break;
		case 'W':
			System.out.println("W->White");
			break;
		default:
			System.out.println("Invalid Code");
		}
		}

}
