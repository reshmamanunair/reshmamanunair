package day2;

public class Operators {
			public static void main(String args[])
		{
		int a=10;
		int b=20;
		//Arithemetic opearators --->+,-,*,%,/
		System.out.println("....arithemetic operators...");
		System.out.println("sum of two numbers"+(a+b));
		System.out.println("mul of two numbers"+(a*b));
		System.out.println("div of two numbers"+(a/b));
		System.out.println("diff of two numbers"+(a-b));
		System.out.println("mod of two numbers"+(a%b));
		//relational opearators(comparison operators)--->== <> <= >= !=
		//always return boolean value
		System.out.println("....relational operators...");

		System.out.println(a>b);//false
		System.out.println(a<b);//true
		System.out.println(a>=b);//false
		System.out.println(a<=b);//true
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		
			//logical operators &&,||
			//works between two booleans
			
		boolean x=true;
		boolean y=false;
		System.out.println("....logical operators...");

		System.out.println(x &&  y);//false
		System.out.println(x || y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
			
//increment/decrement operators ++,--
		
		a=10;
		 a++;           //a=a+1;
		 System.out.println("....increment/decrement operators...");

		System.out.println(a);
		b=20;
		 b--;               //b=b-1;
		System.out.println(b);
		
		
		
		}
			}


