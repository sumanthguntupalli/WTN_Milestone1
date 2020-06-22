package com.wipro.StringStringBuffer;
import java.util.*;
public class Ex2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String[] s2=s.split(",");
		String s1=s2[0];
		String s22=s2[1];
		int l1=s1.length();
		int l2 = s22.length();
		if(s1.charAt(l1-1)==s22.charAt(0))
		{
			System.out.println(s1.toLowerCase()+s22.substring(1));
		}
		else
		{
			System.out.println(s1.toLowerCase()+" "+s22.toLowerCase());
		}
	}

}
