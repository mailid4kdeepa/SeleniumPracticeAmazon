package learningJava;

import java.util.Arrays;

public class UsingArrays {
	public static void main(String[] args) {
		String [] fruits={"mango","kiwi","Orange","Apple","papaya"};
		int [] a= {200,400,600,700};
		System.out.println(fruits.length-1);
		
		System.out.println(fruits[fruits.length-1]);
		
		System.out.println(fruits.length);
		
		System.out.println(Arrays.toString(fruits));// to call all in string
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		System.out.println(a[a.length-1]);
		
	}

}
