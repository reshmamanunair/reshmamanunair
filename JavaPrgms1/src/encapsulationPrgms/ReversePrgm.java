package encapsulationPrgms;

public class ReversePrgm 
{
private int rev=0,d,c;

public void setRev(int a) {
	this.c=a;
	System.out.println("The given number is :" +a);
	while(a!=0) 
	{
		
		d=a%10;
		rev=(rev*10)+d;
		a=a/10;
		
	} 
	
}
public void getrev() {
	
	System.out.println("The reverse number is :" +rev);
}
}
