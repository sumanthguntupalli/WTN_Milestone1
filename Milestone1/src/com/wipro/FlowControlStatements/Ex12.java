package com.wipro.FlowControlStatements;

import java.util.*;
public class Ex12 {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n =sc.nextInt();
        int f=0;
        for (int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                System.out.println("not prime");
                f=1;
                break;
            }
        }
        if(f==0)
        System.out.println("prime");

      
    }
}

