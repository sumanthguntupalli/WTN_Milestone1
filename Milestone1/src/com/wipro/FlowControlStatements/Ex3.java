package com.wipro.FlowControlStatements;

public class Ex3 {
public static void main(String[] args) {
	int length=args.length;
	if(length==0)
		System.out.println("No Values");
	else
	{
		for(int i=0;i<length;i++)
		{
				System.out.print(args[i]);
				if(i!=length-1)
					System.out.print(" , ");
		}
	}
}
}
