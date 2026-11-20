package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedLIST {
	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		
		list.add("apple");
		list.add("mango");
		list.add("apple");
		list.add("pine");
		
		int num = list.size();
		System.out.println(num);
		
		boolean fruits=list.isEmpty();
		System.out.println(fruits);
		boolean frts = list.contains("apple");
		System.out.println(frts);
		
		for (String ftss : list) {
			System.out.println(ftss);
		}
		
		
		
		String value = list.get(0);
		System.out.println(value);
		System.out.println("============");
		list.remove(1);

		int num1 = list.size();
		System.out.println(num1);
	}

}
