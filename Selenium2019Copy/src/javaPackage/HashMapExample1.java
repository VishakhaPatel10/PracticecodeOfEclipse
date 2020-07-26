package javaPackage;
import java.util.HashMap;
class HashMapExample1{
	
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
	    }
	    
	    
	    
		/*
		 * o/p - 
		 * key: USA value: Washington DC 
		 * key: Norway value: vishakha 
		 * key: England value: London 
		 * key: ABCD value: null 
		 * key: Germany value: Berlin
		 */
	  }
	  
	  public int getA()
	  {
		  int a = 100;
		return a;
	  }
	  
	  
	}
class B extends HashMapExample1
 {
	 public int getA()
	  {
		  int a = 50;
		return a;
	  }
	 
	 
	 public static void main(String[] args) {
		B bvar =(B) new HashMapExample1();
		bvar.getA();
	}
 }






