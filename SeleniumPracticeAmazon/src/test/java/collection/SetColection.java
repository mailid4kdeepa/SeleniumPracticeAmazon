package collection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetColection {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>(); //normal order
		//Set<String> set=new TreeSet<String>();//alphabeical order
		
		set.add("apple");
		set.add("mango");
		set.add("pine");
		set.add("apple");
		
		for (String fruits : set) {
			System.out.println(fruits);
			
		}
		boolean empty = set.isEmpty();
		System.out.println(empty);
		int size = set.size();
		System.out.println(size);
		System.out.println("-------------");
		List<String> list=new ArrayList<String>(set);
		String frt = list.get(0);
		System.out.println(frt);
		
	}

}
