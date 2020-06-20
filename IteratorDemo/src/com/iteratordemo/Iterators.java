package com.iteratordemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import javax.management.ImmutableDescriptor;

public class Iterators {

	public static void main(String[] args) {
		
	Set<String> mySet = new HashSet<>();
	Map<String,String> dictionary = new HashMap<>();
	dictionary.put("abc","def");
	dictionary.put("lmn","pqr");
	Set<String> keys = dictionary.keySet();
	for(String key:keys) {
		System.out.println("key is "+key+ " value is "+dictionary.get(key));
	}
	System.out.println(dictionary.get("abc"));
	
	mySet.add("hi");
	mySet.add("hello");
	mySet.add("something");
	List<String> myList = new ArrayList<>(mySet);
	System.out.println("enhanced for loop");
	for(String s:mySet) {
		System.out.println(s);
	}
	
	Iterator<String> itr = mySet.iterator();
	System.out.println("iterator loop");
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("ListIterator loop");
	System.out.println(myList.size());
	ListIterator<String>myIterator = myList.listIterator(myList.size());
	while(myIterator.hasPrevious()) {
		System.out.println(myIterator.previous());
	}
	
	

	}

}
