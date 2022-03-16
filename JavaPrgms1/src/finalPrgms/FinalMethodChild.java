package finalPrgms;

public class FinalMethodChild  extends FinalMethod{
	/*public void addVar(int a,int b) 
	{
		
	add=a+b;
	System.out.println(add); //final method can't override
	
		
		
	}*/

	public static void main(String[] args) {
		FinalMethodChild obj=new FinalMethodChild();
		obj.addVar(12,23);
	}

}
