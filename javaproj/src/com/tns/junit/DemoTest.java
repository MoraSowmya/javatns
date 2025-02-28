package com.tns.junit;
import static org.junit.jupiter.api.Assertions.*;     
import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void test() {
		Demo d=new Demo();
		int actual=d.add(5,5);
		int expected=19;
		if(expected==actual) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
