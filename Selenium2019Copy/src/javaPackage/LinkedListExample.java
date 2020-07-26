package javaPackage;

// Import the LinkedList class
import java.util.LinkedList;
import java.util.List;
public class LinkedListExample {
	


	  public static void main(String[] args) {
	    List<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Ford");
	    cars.add("10");
	    System.out.println(cars);  // o/p - [Volvo, BMW, Ford, Mazda, Ford, 10]  
	    							//--->Duplicates are allowed. maintains insertion order
	  }
	}


