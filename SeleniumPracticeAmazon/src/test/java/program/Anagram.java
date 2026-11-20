package program;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		
		char[] a=s1.toCharArray();//convert to array format
		char[] b=s2.toCharArray();
		
		Arrays.sort(a);//sorting the array from a-z
		Arrays.sort(b);
		
		if(Arrays.equals(a, b))//comparing a and b
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not a anagram");
		}
	}

}
