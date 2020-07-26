package javaPackage;

import java.util.Scanner;

public class SwapOfTwoNumbers {
	
	public static void main(String[] args) {
		
		int num1,num2;
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Enter num1");
		num1= inp.nextInt();
		
		System.out.println("Enter num2");
		num2= inp.nextInt();
		
		inp.close();
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("Num1 is: "+num1);
		
		System.out.println("Num2 is: "+num2);
	}

}
