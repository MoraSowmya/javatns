package com.tns.multithreading;

class Eclipse extends Thread {
	public void run() {
		System.out.println("Ecllipse "+Thread.currentThread().getId());
	}
	
}

class notepad extends Thread{
	public void run() {
		System.out.println("notepad "+Thread.currentThread().getId());
		System.out.println("hello "+Thread.currentThread().getId());
}
}
class chrome extends Thread{
	public void run() {
		System.out.println("chrome "+Thread.currentThread().getId());	
}
}
public class Maindemo {
	public static void main(String[] args) {
		System.out.println("mainmethod "+Thread.currentThread().getId());	
		Eclipse e=new Eclipse();
		notepad n=new notepad();
		chrome ch=new chrome();
		e.start();
		n.start();
		ch.start();
		
	}

}
