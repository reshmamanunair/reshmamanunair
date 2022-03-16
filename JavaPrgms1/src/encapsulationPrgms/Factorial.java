package encapsulationPrgms;

public class Factorial {
	private int num;
	private int fact=1;
	public void setfactorial(int num) {
		this.num=num;
		for(int i=1;i<=num;i++) {
			
			fact=fact*i;
		}
		
	}
	public int getfactorial() 
	{
		return fact;
		
	}

}
