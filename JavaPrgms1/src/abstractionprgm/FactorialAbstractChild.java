package abstractionprgm;

public class FactorialAbstractChild extends FactorialAbstract 
{
	 long fact=1;
	public  void factotial(int num) 
	{
		
		for(int i=1;i<=num;i++)
		{
			
		fact=fact*i; //1 2 6 24 120
		}
		System.out.println("The given number is" +num);
		System.out.println("The factorial of the number is "+fact);
		}
		
	
	

	public static void main(String[] args) {
		
		FactorialAbstractChild obj=new FactorialAbstractChild();
		obj.factotial(5);
	}

}
