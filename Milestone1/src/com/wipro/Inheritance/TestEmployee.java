package com.wipro.Inheritance;
class Person
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class Employee extends Person
{
	public double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	public int getStartedYear() {
		return startedYear;
	}
	public void setStartedYear(int startedYear) {
		this.startedYear = startedYear;
	}
	public String getInsurance_number() {
		return insurance_number;
	}
	public void setInsurance_number(String insurance_number) {
		this.insurance_number = insurance_number;
	}
	private double annual_salary;
	private int startedYear;
	private String insurance_number;
	
	}
public class TestEmployee {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("sumanth");
		e.setStartedYear(2020);
		e.setInsurance_number("av2025");
		e.setAnnual_salary(5000000);
		Person p=new Person();
		System.out.println("name "+e.getName()+" salary "+e.getAnnual_salary()+" started year "+e.getStartedYear()+" insuranceid "+e.getInsurance_number());
	}

}
