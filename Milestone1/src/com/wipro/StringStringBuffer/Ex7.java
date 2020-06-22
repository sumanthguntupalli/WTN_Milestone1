package com.wipro.StringStringBuffer;
import java.util.*;
public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.startsWith("x")&&s.endsWith("x"))
			System.out.println(s.substring(1, s.length()-1));
		else if(s.startsWith("x"))
			System.out.println(s.substring(1));
		else if (s.endsWith("x"))
			System.out.println(s.substring(0, s.length()-1));
		else
			System.out.println(s);
	}

}
