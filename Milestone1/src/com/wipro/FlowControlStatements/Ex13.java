package com.wipro.FlowControlStatements;
public class Ex13 {
    public static void main(String args[]) {
    	int j;
    	for (j=10;j<=99;j++)
    	{
    		 int f=0;
    	        for (int i=2;i<=(int)Math.sqrt(j);i++)
    	        {
    	            if(j%i==0)
    	            {
    	                f=1;
    	                break;
    	            }
    	        }
    	        if(f==0)
    	        System.out.println(j);
    	}
       

      
    }
}

