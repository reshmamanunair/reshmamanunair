package day2practice;

public class Positiveornegative {
public static void main(String args[]) {
//program to find the positive and negative number
	
	int i=10;
	if(i>0)
	
{
System.out.println("print as postive number");

}
	else {
		System.out.println("print as negative number");	
	}
	//print the largest of 3 numbers
	
	int o=5;
	int k=20;
	int y=10;
	if(o>k) {
		System.out.println("print o is largest");
	}
	else if(k>y)
	{
		System.out.println("print  k is largest");
	}
	else if(y>o)
	{
		System.out.println("print y is largest");
	}
	else {
		System.out.println("print as invalid data");
	}
	
	//prgm to display the multiplication table of 5
	
	int num=5;
for(int a=0;a<=10;a++)
{
	System.out.println(num+"*"+a+"="+num*+a);
}

//progm to count the number of digits of number

int e=58632;
int count=0;

while(e>0)
{
	e/=10;           // e=e/10 here e is number

count++;
}
	System.out.println("number of digits in a number is:"+count);
	
	
}

}
