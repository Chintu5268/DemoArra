package com.list;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(65);
		list.add(35);
		list.add(27);
		list.add(63);
		
		for (Integer num : list) {
			System.out.println(num);
		}
	}
}
