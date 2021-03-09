package helloworld;

import java.util.Scanner;

public class Products {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		double a;
		a = s.nextDouble();
		System.out.println("Enter the value of b");
		double b;
		b = s.nextDouble();
		System.out.println("Enter your room temparature in celsius");
		double c;
		c = s.nextDouble();
		System.out.println("Enter radius length");
		double rad;
		rad = s.nextDouble();
		
		double x;
		x = a-b;
		
		double d;
		d=9/5;
		
		double f;
		f = ((c*d)+32);
		
		double r;
		r = Math.pow(rad, 2);
		
		double area;
		area = (3.14)*r;
		
		double A;
		A = 5000 * Math.pow((1+0.04),10);
		
		System.out.println("The difference of a and b is\t" +x);
		System.out.println("The temparature in Farenheit is\t" +f);
		System.out.println("The area of circle is\t" +area);
		System.out.println("The total amount after compound interest is\t" +A);
		
	}

}
