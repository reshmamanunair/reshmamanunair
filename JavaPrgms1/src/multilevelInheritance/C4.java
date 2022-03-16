package multilevelInheritance;

public class C4 extends C3
{
	
	int num=151,rev=0,d,temp;
	
	public void palindrome() 
	{
		temp=num;
		System.out.println("The given number is " +num);
		while(num!=0) 
		{
			
		d=num%10;
		rev=(rev*10)+d;
		num=num/10;
		
		}
		
		System.out.println("The reverse of the number is " + rev);
		if(rev==temp)
		{
			
			System.out.println("The given number is palindrome " + rev);
		}
		else
		{
			
			System.out.println("The given number is not a palindrome");
			
		}
		}
		
	

	public static void main(String[] args) 
	{
		
C4 obj=new C4();
obj.factorial();
obj.reverse();
obj.palindrome();
	}

}
