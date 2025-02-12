package com.tns.multithreading;

 class demo extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("demo "+Thread.currentThread().getId());
			
			try {
				sleep(2000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
public class Sleepexamp {
public static void main(String[] args) {
	demo d=new demo();
	d.start();
}
}