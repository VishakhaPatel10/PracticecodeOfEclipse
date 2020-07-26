package javaPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTry {
	public static void main(String[] args) {
	    HashSet<String> cars = new LinkedHashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);  // o/p - [Volvo, BMW, Ford, Mazda] --> duplicate not allowed
	    							// Maintains insertion order
	  }

}
