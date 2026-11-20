package program;

public class DuplicateInArray {
	public static void main(String[] args) {
		int [] a= {10,20,30,10,20};
		
		boolean duplicate=false;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					duplicate=true;
					break;
				}
			}
			if(!duplicate)
			{
				System.out.println(a[i]);
			}
		}
			


		
	}

}
