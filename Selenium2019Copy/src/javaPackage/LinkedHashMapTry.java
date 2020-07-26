package javaPackage;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapTry {

	 public static void main(String[] args) {
		    HashMap<String, String> capitalCities = new LinkedHashMap<String, String>();
		    capitalCities.put("England", "vishakha");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    capitalCities.put("Norway", "vishakha");
		    capitalCities.put("ABCD", null);
		    capitalCities.put("XYZ", null);
		    capitalCities.put(null, "Try1");
		    capitalCities.put(null, "try2");
		    
		    for (String i : capitalCities.keySet()) {
		      System.out.println("key: " + i + " value: " + capitalCities.get(i));
		    }
		  //Output -- As per insertion order and if same key is entered multiple times then
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
