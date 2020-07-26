package javaPackage;

import java.util.TreeMap;

public class TreeMapTry {
	public static void main(String[] args) {
		TreeMap<String, String> capitalCities = new TreeMap<String, String>();
		capitalCities.put("England", "vishakha");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		capitalCities.put("Norway", "vishakha");
		capitalCities.put("ABCD", null);
		capitalCities.put("XYZ", null);
		// capitalCities.put(null, "Try1");
		// capitalCities.put(null, "try2");

		// If above two lines are uncommented then getting runtime Nullpointer exception because
		// Tree map doesn't allow any null key
		//That means 
		
		for (String i : capitalCities.keySet()) {
			System.out.println("key: " + i + " value: " + capitalCities.get(i));
		}
		
		//Output -- Ascending order of key and if same key is entered multiple times then
		//it will override the value with last one
		/*
		key: ABCD value: null
		key: England value: vishakha
		key: Germany value: Berlin
		key: Norway value: vishakha
		key: USA value: Washington DC
		key: XYZ value: null*/
	}

}
