package javaPackage;

import java.util.HashMap;

public class HashMapExample2 {
	
	 public static void main(String[] args) {
		    HashMap<String, String> capitalCities = new HashMap<String, String>();
		    capitalCities.put("England", "vishakha");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    capitalCities.put("Norway", "vishakha");
		    capitalCities.put("ABCD", null);
		    capitalCities.put("XYZ", null);
		    capitalCities.put(null, "Try1");
		    capitalCities.put(null, "try2");
		    
		    capitalCities.put("ABCD", null);
		    for (String i : capitalCities.keySet()) {
		      System.out.println("key: " + i + " value: " + capitalCities.get(i));
		      
		      
		    //Output -- Maintains NO order and if same key is entered multiple times then
			  //it will override the value with last one. Same goes if we enter multiple null key then
			  //it will override the value with last one
				/*
				key: England value: vishakha
				key: Germany value: Berlin
				key: Norway value: vishakha
				key: USA value: Washington DC
				key: ABCD value: null
				key: XYZ value: null
				key: null value: try2
				 */
		    }
	 }

}
