package overriding;

public class C4 extends P3{
	int fact=1;
	public void factorial(int n) 
	{
		super.factorial(5);
		for(int i=1;i<=n;i++) 
		{
			fact=fact*i;
			
		}
		System.out.println("The factorial of number 7 is " +fact);
		System.out.println();
		
	}
	public static  void main(String[] args) {
		
C4 obj=new C4();
obj.factorial(7);
	}

}
