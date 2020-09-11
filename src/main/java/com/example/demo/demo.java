package com.example.demo;

import java.util.ArrayList;
import java.util.function.Predicate;

public class demo {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("qwe");
		list.add("qwe");
		list.add("qwe");
		list.add("qwe");
		
		Predicate p = ( str)->{
			if (((String)str).startsWith("a"))
				return true;
			return false;
		};
	
		list.stream().filter(p);
	}

}
