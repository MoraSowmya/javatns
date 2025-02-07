package com.tns.scannerdemo;

public class Taxcalcation {

	public void calucatateTax(Person p)
	{
		if(p.getIncome()<=20000) {
			p.setTax(0);
		}
		else if(p.getIncome()>=20000 && p.getIncome()<40000) {
			p.setTax(5);
		}
		else {
			p.setTax(10);
		}
	}

}
