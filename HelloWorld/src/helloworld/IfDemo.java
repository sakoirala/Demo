package helloworld;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a;
		a = s.nextInt();
		
		System.out.println("Enter the value of b");
		int b;
		b=s.nextInt();
		
		if (a>b) {
		System.out.println ("a is greater than b");
		}
		
		else if (a<b) {
		System.out.println ("b is greater than a");
		}
		
		else  {
		System.out.println ( "a and b are equal");
		}
		
		
	}
	
}
