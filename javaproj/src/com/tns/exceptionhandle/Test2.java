package com.tns.exceptionhandle;
//exception without matching catch block

public class Test2 {

	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
     finally{
    	System.out.println("thankyou"); 
         }
	}
}
