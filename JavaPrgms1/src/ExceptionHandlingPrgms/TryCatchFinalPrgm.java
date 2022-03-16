package ExceptionHandlingPrgms;

public class TryCatchFinalPrgm {

	public static void main(String[] args)
	{
		int a=12,b=23,sum,div;
		try {
			
			div=45/0;
			
		}
		catch(ArithmeticException e)
		{
		System.out.println(e);
		
		}
		finally  //if not given it will also work .finally is given it must given the statement inside the final block
		{
			
			sum=a+b;
			System.out.println("Finally block" +sum);
			System.out.println("End of the loop");
		}
		

	}

}
