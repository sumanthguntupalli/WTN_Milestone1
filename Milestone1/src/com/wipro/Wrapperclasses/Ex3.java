package com.wipro.Wrapperclasses;
import java.util.*;
public class Ex3 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the number in range of 1 to 255");
	int n=sc.nextInt();
	String s=Integer.toBinaryString(n);
	int v=Integer.parseInt(s);
	String str = String.format("%08d", v);
	System.out.println(str);
}
}
