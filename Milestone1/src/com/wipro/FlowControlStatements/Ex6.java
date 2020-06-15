package com.wipro.FlowControlStatements;
public class Ex6 {
		  public static void main(String args[])
		  {
		  String Gender=args[0];
		  int age=Integer.parseInt(args[1]);
		  double p=10000;
		  if(Gender.equalsIgnoreCase("female"))
		  {
		  if(age>=1 && age<=58) {
			  System.out.println("Interest=8.2%");
			  System.out.println("Total Amout"+(p+(p*1*8.2)/100));
		  }
		  
		  else if(age>58 && age<=100) {
			  System.out.println("Interest=9.2%");
			  System.out.println("Total Amout"+(p+(p*1*9.2)/100));
		  }
		  }
		  else if(Gender.equalsIgnoreCase("male"))
		  {
		  if(age>=1 && age<=58)
		  {
			  System.out.println("Interest=8.4%");
			  System.out.println("Total Amout"+(p+(p*1*8.4)/100));
		  }
		  
		  else if(age>60 && age<=100)
		  {
			  System.out.println("Interest=10.5%");
			  System.out.println("Total Amout"+(p+(p*1*10.5)/100));
		  }
		  
		  }
		  }
}
