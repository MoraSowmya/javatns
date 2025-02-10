package com.tns.exceptionhandle;

public class Throwdemo {
	public void validate(int age) {
		try
		{
			if(age<18){
				System.out.println("Not elligible");
			}
			else {
				System.out.println("Elligible");
			}
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
				
			}
		}

	public static void main(String[] args) {
		Throwdemo d=new Throwdemo();
		d.validate(21);
		
	}

}
