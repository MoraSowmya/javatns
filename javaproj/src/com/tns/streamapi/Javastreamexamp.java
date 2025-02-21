package com.tns.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Javastreamexamp {
	public static void main(String[] args) {
		List<Product>productlist=new ArrayList<Product>();
		
		productlist.add(new Product (1,"hp",25000f));
		productlist.add(new Product (2,"dell",35000f));
		productlist.add(new Product (3,"apple",44000f));
		productlist.add(new Product (4,"hp victus",56000f));
		 
		//filter()=filter the data ,map()=fetch price ,collect-collecting list 
		List <Float> pl=productlist.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(pl);

		double totalprice=productlist.stream().collect(Collectors.summingDouble(Product->Product.price));
		System.out.println(totalprice);
		//max price
		Product a=productlist.stream().max((pro1,pro2)->pro1.price>pro2.price?1:-1).get();
		System.out.println(a.price);
		//min price
		Product ab=productlist.stream().min((pro1,pro2)->pro1.price>pro2.price?1:-1).get();
		System.out.println(ab.price);
		//count() method
		long count=productlist.stream().filter(product->product.price<50000).count();
		System.out.println(count);
	}
}