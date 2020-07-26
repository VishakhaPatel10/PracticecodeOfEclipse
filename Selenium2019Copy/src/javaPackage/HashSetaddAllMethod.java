package javaPackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetaddAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1[] = {"Warsaw", "Dublin", "Madrid", "London", "Sydney", null,"London"};
		//List<String> list1 = Arrays.asList(str1);
		Set<String> list1 = new HashSet<String>();
		System.out.println("====Displaying List====");
		Collections.addAll(list1, str1);
		System.out.println(list1);
		System.out.println();


	}

}
