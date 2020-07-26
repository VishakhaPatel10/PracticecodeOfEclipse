package javaPackage;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int year;
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter year");
		year =inp.nextInt();
		
		/*if(year%400==0)
			System.out.println(year+" is  leap year");
		else
			System.out.println(year+" is not a leap year"); */
		
		
		if((year%400==0) || (year%4 ==0 && year%100 !=0))
			System.out.println(year+" is  leap year");
		else
			System.out.println(year+" is not a leap year");
	}

}
