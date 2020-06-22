package com.wipro.StringStringBuffer;
import java.util.*;
public class Ex10 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String[] s2=s.split(",");
		String s1=s2[0];
		int i=Integer.parseInt(s2[1]);
		int l1=s1.length();
		String s22=s1.substring(l1-i,l1);
		for (int j=0;j<i;j++)
			System.out.print(s22);
	}
}
