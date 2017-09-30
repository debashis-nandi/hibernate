package com.global.hb;

import java.time.LocalDate;
import java.util.*;


public class CustomerDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Customer> customerList = new ArrayList<Customer>();
		for(int i=0;i<50; i++)
		{
			LocalDate date = LocalDate.of(1981,1,9); 	
			Customer customer = new Customer(i, "Debashis", "debashis@gmail.com", "8860-382-54" + String.valueOf(i), date);	
			customerList.add(customer);
		}
		System.out.println("------------------------Phone Number ends with 2------------------------------------");
		customerList.stream().filter(t -> t.getCustPhone().endsWith("2")).forEach(t -> System.out.println(t.toString()));
	}

}
