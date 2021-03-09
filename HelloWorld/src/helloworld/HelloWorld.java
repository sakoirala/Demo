package helloworld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		double a;
		a = s.nextDouble();
		System.out.println("Enter the value of b");
		double b;
		b = s.nextDouble();
		System.out.println("Enter the value of c");
		double c;
		c = s.nextDouble();
		System.out.println("Enter the value of d");
		double d;
		d = s.nextDouble();
		System.out.println("Enter the value of e");
		double e;
		e = s.nextDouble();
		
		System.out.println("Enter your name");
		String x;
		s.nextLine();
		x =  s.nextLine();
		
		double Average = (a+b+c+d+e)/5;
		
		System.out.println("Your name is\t" +x);
		System.out.println("The average for five numbers is\t" +Average);
     
}  
		
}
