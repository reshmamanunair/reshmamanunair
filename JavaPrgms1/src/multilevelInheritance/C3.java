package multilevelInheritance;

public class C3 extends P2{
int num=256,rev=0,d;

public void reverse() 
{
	
	System.out.println("The number given is " +num);
	while(num!=0) 
	{
		
	d=num%10;
	rev=(rev*10)+d;
	num=num/10;
	}
	
	System.out.println("The number after reversing is " +rev);
	System.out.println();
	
	
}
public static void main(String args[]) {
	C3 obj=new C3();
	obj.factorial();
	
	
}
	
}
