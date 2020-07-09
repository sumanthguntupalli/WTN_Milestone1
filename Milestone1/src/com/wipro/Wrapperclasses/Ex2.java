package com.wipro.Wrapperclasses;
public class Ex2 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	String hexa=Integer.toHexString(n);
	String bin=Integer.toBinaryString(n);
	String oct=Integer.toOctalString(n);
	System.out.println("Given number is : "+n);
	System.out.println("Binary equivalent : "+bin);
	System.out.println("Octal Equivalent :"+oct);
	System.out.println("Hexa Equivalent :"+hexa);
}
}
