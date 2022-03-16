package finalPrgms;

public class FinalVariable 
{
final int a=500;
public void disp() {
	//a=100;     //we can't  change values of final values
	System.out.println(a);
	
}
	public static void main(String[] args) {
		FinalVariable obj=new FinalVariable();
		obj.disp();
		
	}

}
