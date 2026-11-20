package program;

public class MultipleOccuranceOfChar {
	public static void main(String[] args) {
		String s="banana";
		
		for(int i=0;i<s.length();i++)
		{
			
			char ch=s.charAt(i);
			if(s.indexOf(ch)==i)
			{
				int count=0;
				
				for(int j=0;j<s.length();j++)
				{
					if(ch==s.charAt(j))
					{
						count++;
					}
				}
			System.out.println(ch+"="+count);
			}
			
		}
	}

}
