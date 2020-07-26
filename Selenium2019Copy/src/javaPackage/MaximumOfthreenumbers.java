package javaPackage;

import java.util.Scanner;

public class MaximumOfthreenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp= new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Enter value of a");
		a=inp.nextInt();
		
		System.out.println("Enter value of b");
		b=inp.nextInt();
		System.out.println("Enter value of c");
		c=inp.nextInt();
		inp.close();
		if(a>b && a>c)
			System.out.println("A is greater");
		else if (b>a && b>c)
			System.out.println("B is greater");
		else
			System.out.println("C is greater");

	}

}
