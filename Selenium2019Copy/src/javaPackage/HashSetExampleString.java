package javaPackage;
import java.util.Collections;
//Import the HashSet class
	import java.util.HashSet;
public class HashSetExampleString {
	
	


	  public static void main(String[] args) {
	    HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    //Collections.sort(cars);
	    System.out.println(cars);  // o/p - [Volvo, Mazda, Ford, BMW] --> duplicate not allowed
	    							//Maintains no order
	  }
	}
