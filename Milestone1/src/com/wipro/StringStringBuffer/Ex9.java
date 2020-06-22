package com.wipro.StringStringBuffer;
import java.util.*;
public class Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = sc.next();
		int l=s.length();
		String res="";
		for(int i=0;i<l;i++)
		{
			 String res2=""+s.charAt(i)+s1.charAt(i);
			
			res=res+res2;
		}
		System.out.println(res);
		
	}
}
