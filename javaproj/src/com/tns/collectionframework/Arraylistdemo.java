package com.tns.collectionframework;
import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		System.out.println("size"+ar.size());
		System.out.println(ar);
		System.out.println(ar.contains(2));
		
	System.out.println(ar.isEmpty());
	System.out.println(ar.remove(0));
	System.out.println(ar);
	}
}
