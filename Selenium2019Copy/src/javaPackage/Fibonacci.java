package javaPackage;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f1,f2=0,f3=1;
		
		int num;
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter number ");
		num= inp.nextInt();
		
		
		
		for(int i=0;i<=num;i++)
		{
			System.out.println(" " +f3+" ");
			f1=f2;
			f2=f3;
			f3=f1+f2;
		
		
		}
		
		
		
	}

}
