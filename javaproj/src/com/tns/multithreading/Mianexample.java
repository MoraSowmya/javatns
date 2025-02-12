package com.tns.multithreading;

class Eclip implements Runnable{
public void run() {
	System.out.println("Eclip "+Thread.currentThread().getId());
}
}
class Flipkart implements Runnable{
	public void run() {
		System.out.println("flipkart "+Thread.currentThread().getId());
	}
}

public class Mianexample {

	public static void main(String[] args) {
		Eclip e =new Eclip();
		Thread obj=new Thread(e);
		obj.start();
		
		Flipkart f= new Flipkart();
		Thread obj1=new Thread(f);
		obj1.start();
		
		
		//for priority
		obj1.setPriority(Thread.MIN_PRIORITY);
		for(int i=0;i<5;i++)
		System.out.println("mainmethod "+Thread.currentThread().getId());
		

	}

}
