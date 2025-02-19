package com.tns.collectionframework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Setoperation {
	public static void main(String[] args) {
		
Stack<Integer> se=new Stack<Integer>();
		
		se.add(10);
		se.add(5);
		se.add(4);
		se.add(7);
		System.out.println(se);
		//to add all at once
		se.addAll(Arrays.asList(new Integer[] {1,2,3}));
		System.out.println(se);
		System.out.println(se.size());
		
	
		Set<Integer> oddset=new HashSet<Integer>();
		oddset.addAll(Arrays.asList(new Integer[] {3,5,6}));
		System.out.println(oddset);
		
		Set<Integer> intersection=new HashSet<>(se);
		intersection.retainAll(oddset);
		System.out.println(intersection);
		
		
	}
}
