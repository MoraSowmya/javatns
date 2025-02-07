package com.tns.constructor;

import java.util.Scanner;

public class Constructexamp {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the customer name");
		
		String name=sc.next();
		
System.out.println("enter the customer id");
		
		int id=sc.nextInt();
		
System.out.println("enter the customer addresss");
		
		String adress=sc.next();
		
		Customer c=new Customer();
		
		c.setCustomername(name);
		c.setCustomerid(id);
		c.setCustomeradreess(adress);
		
		System.out.println(c);
		

}

}
