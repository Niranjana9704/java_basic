package day1;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
	int a,b,c;
	Scanner s = new Scanner(System.in);
	a = s.nextInt();
	b = s.nextInt();
	System.out.print("Enter the name:");
	String name;
	name = s.next();
	c = a+b;
	System.out.println("Addition of a = "+a+" and b = "+b+" is"+c);
	System.out.println("Name is "+name);
	}

}
