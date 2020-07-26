package javaPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListaddAllMethod {

	public static void main(String[] args) 
	{
	String str1[] = {"Warsaw", "Dublin", "Madrid", "London", "Sydney", null,"Madrid"};

	//List<String> list1 = Arrays.asList(str1);
	List<String> list1 = new ArrayList<String>();
	System.out.println("====Displaying List====");
	Collections.addAll(list1, str1);
	System.out.println(list1);
//To check whether this changes are reflecting in git I am adding this comment

	}

}
