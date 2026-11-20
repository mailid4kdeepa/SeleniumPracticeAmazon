package program;

public class Fibonaci2 {
	public static void main(String[] args) {
		int n=20;
		int a=0,b=1;
		
		System.out.print(a+" "+b+" ");
		for(int i=1;i<n;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			
			a=b;
			b=c;
		}
		
		
	}

}
