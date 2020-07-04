package com.wipro.Exceptions;
import java.util.*;
class Outofrange extends Exception
{
	Outofrange(String s)
	{
		super(s);
	}
}
public class Ex3 {
	public static void main(String[] args) throws Outofrange {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter student name");
		String name=sc.next();
		int sum=0;
		try
		{
			
			System.out.println("enter student marks for 3 subjects");
			for (int i=0;i<3;i++)
			{
				String s1=sc.next();
				int n=Integer.parseInt(s1);
				if(n<0 || n>100)
					throw new Outofrange("marks exception");
				sum+=n;
			}
			System.out.println("Average is "+sum/3);
		}
		catch (NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(Outofrange e)
		{
			System.out.println("marks exption ENTER 0-100 only");
		}
	}

}
