package assignment.java1;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int a=sc.nextInt();
	for(int i=1;i<=a;i++) {
			int b=2*i-1;
			System.out.print(b);
			if(i<a)System.out.print(" ,");
		}

		
	}
}

