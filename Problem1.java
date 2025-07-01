package problem1;

import java.util.Scanner;

public class Problem1 {
	private double a;
	private double b;
	private String operation;
	public Problem1(double a,double b,String op) {
		this.a=a;
		this.b=b;
		this.operation=op;
	}
	public double calculate() {
		switch(operation) {
		case "Addition":
			return a+b;
		case "Subtraction":
			return a-b;
		case "Division":
			if(b==0) {System.out.println("cannot divide by Zero!!");return Double.NaN;}
			return a/b;
		case "Multiplication":
			return a*b;
		default: 
			System.out.println("invalid!!!");
			return Double.NaN;
	}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		double a=sc.nextDouble();
		System.out.println("Enter a number");
		double b=sc.nextDouble();
		System.out.println("Enter the opeartion [Addition, Subtraction, Multiplication, Division]");
		String op=sc.next();
		Problem1 c=new Problem1(a,b,op);
		System.out.println("The "+op+" of "+a+","+b+" is "+ c.calculate());
		
		
	}
}


