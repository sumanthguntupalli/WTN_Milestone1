package com.wipro.StringStringBuffer;
import java.util.*;
public class Ex4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int l=s.length();
		if(l%2==0)
			System.out.println(s.substring(0,l/2));
		else
			System.out.println("null");
	}

}
