package com.wipro.StringStringBuffer;
import java.util.*;
public class Ex6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		int l=s.length();
		int l1=s1.length();
		if (l<l1)
		{
			System.out.println(s+s1+s);
		}
		else
			System.out.println(s1+s+s1);
	}

}
