package overriding;

public class P3 {
	int fact=1;
	public void factorial(int n) 
	{
		for(int i=1;i<=n;i++) 
		{
			fact=fact*i;
			
		}
		System.out.println("The factorial of number 5 is " +fact);
		System.out.println();
		
	}

	
}
