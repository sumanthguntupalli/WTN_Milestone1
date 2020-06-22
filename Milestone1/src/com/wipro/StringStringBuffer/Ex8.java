package com.wipro.StringStringBuffer;
import java.util.*;
public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.contains("*"))
		{
			int i=s.indexOf('*');
			System.out.println(s.substring(0, i)+s.substring(i+1, s.length()));
		}
		else
			System.out.println(s);
		
	}
}
