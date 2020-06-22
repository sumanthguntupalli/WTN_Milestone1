package com.wipro.StringStringBuffer;
import java.util.*;
public class Ex5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int l=s.length();
		System.out.println(s.substring(1, l-1));
	}
}
