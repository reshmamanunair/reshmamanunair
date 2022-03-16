package ExceptionHandlingPrgms;

public class ThrowPrgm {
	public static void age(int age) {
		
		if(age<18)
		{
			throw new ArithmeticException("not valid");
			
			
			
		}
		else {
			
			System.out.println("eligible for vote");
		}
		
	}

	public static void main(String[] args) 
	{
		ThrowPrgm.age(12);
		System.out.println("rest of the code");
		

	}

}
