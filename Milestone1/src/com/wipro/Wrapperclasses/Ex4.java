package com.wipro.Wrapperclasses;
class Employee implements Cloneable
{
	int a,b,c;
		void set(int a,int b,int c) {
			this.a=a;
			this.b=b;
			this.c=c;
		}
		Employee cloneTest()
		 {
		  try
		  {
		   return (Employee)super.clone();

		  }
		  catch(CloneNotSupportedException e)
		  {
		   System.out.println("Cloning Not Allowed");
		   return this;
		  }
}
}
public  class Ex4 {
	public static void main(String[] args) {
		Employee e= new Employee();
		e.set(1,2,3);
		System.out.println(e.a+" "+e.b+" "+e.c);
		Employee e1;
		e1=(Employee) e.cloneTest();
		System.out.println(e1.a+" "+e1.b+" "+e1.c);
		e.set(2, 3, 3);
		System.out.println(e.a+" "+e.b+" "+e.c);
		System.out.println(e1.a+" "+e1.b+" "+e1.c);
	}

}

