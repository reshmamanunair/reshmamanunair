

package palindromeString;

import java.util.Scanner;

public class PalinString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);		
		
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		String orgstr1=str;
		
		String rev="";
		
		int leng=str.length();
		
		for(int i=leng-1;i>=0;i--)
		{
			
			rev=rev+str.charAt(i);
		}
		//System.out.println(rev);
		
		if(rev==orgstr1)
		{
			
			System.out.println(orgstr1+ "The String is palindrome");
			
		}
		else
		{
			System.out.println(orgstr1+ "The String is not palindrome");
		}
		
	}

}
