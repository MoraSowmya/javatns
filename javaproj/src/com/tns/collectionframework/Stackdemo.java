package com.tns.collectionframework;


import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		Stack<Integer> ob=new Stack<Integer>();
		
		ob.add(20);
		ob.add(32);
		ob.add(44);
		ob.add(67);
		
		// for pop
		ob.pop();
		
		//stack elements
		System.out.println(ob);
		
		//to see top element
		System.out.println(ob.peek());
		
		if(ob.isEmpty()) {
			System.out.println("Is empty");
		}
		else {
			System.out.println("not empty");
		}
		
		//for search
		System.out.println(ob.search(22));
	}

}


