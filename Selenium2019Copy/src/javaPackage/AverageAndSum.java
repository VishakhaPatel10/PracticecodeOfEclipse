package javaPackage;

import java.util.Scanner;

public class AverageAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2;
		int sum;
		float average;
		Scanner inp= new Scanner(System.in);
		
	System.out.println("Enter num1");
	num1=inp.nextInt();
	
	System.out.println("Enter num2");
	num2=inp.nextInt();
	
	sum=num1+num2;
	System.out.println("Sum is "+sum);
	
	average=(float)((num1+num2)/2);
	System.out.println("Average is "+average);
	
	
		}
	}


