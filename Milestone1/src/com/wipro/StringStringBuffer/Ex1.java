package com.wipro.StringStringBuffer;
import java.util.*;
public class Ex1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		int f=0;
		int l=s.length();
		for (int i=0;i<(int)l/2;i++)
		{
			if(s.charAt(i)!=s.charAt(l-i-1))
			{
				f=1;
				System.out.println("not palindrom");
				break;
			}
		}
		if(f==0)
			System.out.println("pallidrom");
	}

}
