package javaPackage;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    myNumbers.add(10);
    
   // Collections.sort(myNumbers);
    System.out.println(myNumbers);
    
	/*
	 * for (int i : myNumbers) { System.out.println(i); }
	 */
    
	/*
	 * o/p - 10 10 15 20 25  --->Duplicates are allowed. maintains NO order
	 */
  }
}
