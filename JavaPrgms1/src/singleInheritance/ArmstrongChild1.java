package singleInheritance;

public class ArmstrongChild1 extends ArmstrongParent {

	public void armstrong() 
	{
		temp=num;
		System.out.println("The given number is " +num);
		while(num!=0) 
		{
			d=num%10;
			rev=rev+d*d*d;
			num=num/10;
			}
		System.out.println("The result is" +rev);
		
		
	
	if(rev==temp) {
		System.out.println("The given number is armstrong");

	}
	else {
		System.out.println("The given number is not a armstrong");
	}
	}
	public static void main(String[] args) {
		ArmstrongChild1 obj=new ArmstrongChild1();
		obj.armstrong();

	}

}
