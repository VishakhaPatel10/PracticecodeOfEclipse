package javaPackage;
//Import the HashSet class
	import java.util.HashSet;
public class HashSetExampleInteger {
	
	


	  public static void main(String[] args) {
		// Create a HashSet object called numbers
		    HashSet<Integer> numbers = new HashSet<Integer>();

		    // Add values to the set
		    numbers.add(4);
		    numbers.add(7);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(4);
		    numbers.add(7);
	    System.out.println(numbers);  /// 4,7,8, 9 -->duplicate not allowed and no  order
	  }
	}
