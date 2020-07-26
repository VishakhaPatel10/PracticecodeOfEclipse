package javaPackage;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
	    TreeSet<String> cars = new TreeSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);  // o/p - [BMW, Ford, Mazda, Volvo] --> duplicate not allowed
	    							// Maintains ascending order
	  }
}
