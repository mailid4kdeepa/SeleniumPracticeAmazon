package program;

public class CountingVowelsandConsonants {
	public static void main(String[] args) {
		String s="Hello World";
		s=s.toLowerCase();
		
		int vowels=0,consonants=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
					
			if(ch>='a'&&ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
		}
		System.out.println("vowels"+vowels);
		System.out.println("consonants"+" "+ consonants);
	}

}
