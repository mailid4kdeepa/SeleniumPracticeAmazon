package program;

public class ReverseSting {
	public static void main(String[] args) {
		String s="Hello World";
		/*String reverse=" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse +=s.charAt(i);
		}
		System.out.println(reverse);*/
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		
	}

}
