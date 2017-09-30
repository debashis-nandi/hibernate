package com.global.hb;

import java.util.Arrays;
import java.util.stream.Stream;

public class SumOfIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] listInt = new int[] { 1,2,3 };

		Stream<Integer> ls = Arrays.stream(listInt).boxed();
		int sum = ls.map(v -> v).reduce( (x, y) -> x + y).get();

		System.out.println(sum);
	}

}