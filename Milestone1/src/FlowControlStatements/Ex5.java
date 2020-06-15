package FlowControlStatements;
import java.util.*;
public class Ex5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a characters");
	char ch=sc.next().charAt(0);
	if(ch>=65 && ch <=90 || ch>=97 && ch <=122)
		System.out.println("Alphabhet");
	else if (ch>=48 && ch<=57)
		System.out.println("Digit");
	else
		System.out.println("special character");
}
}
