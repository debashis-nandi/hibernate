package com.global.hb;

import java.time.LocalDate;
import java.util.*;


public class CustomerDisplay {
	public static void main(String[] args) {
		List<Customer> customerList = new ArrayList<>();
		for(int i=0;i<100000; i++)
		{
			LocalDate date = LocalDate.of(1981,1,9); 	
			Random r = new Random();
			int k = r.nextInt(10000000);
			Customer customer = new Customer(i, "Debashis", "debashis@gmail.com",  String.valueOf(k), date);	
			customerList.add(customer);
		}
		System.out.println("------------------------Phone Number ends with 2------------------------------------");
		customerList.stream().filter(t -> t.getCustPhone().endsWith("9181")).forEach(t -> System.out.println(t.toString()));
	}
	  }
