package ReverseString;
import java.util.Scanner;

public class RevString1 {

	public static void main(String[] args) {
		
	
				Scanner sc=new Scanner(System.in);		
				
				System.out.println("Enter the string");
				String str=sc.nextLine();
				
				String str1=str;
				
				String rev="";
				
				int leng=str.length();
				
				for(int i=leng-1;i>=0;i--)
				{
					
					rev=rev+str.charAt(i);
				}
				System.out.println(rev);
				
				if(str1.equals(rev))
						{
					
					System.out.print("The given string is palindrome");
				}
				else {
					System.out.print("The given string is not  palindrome");
				}
			}

		

	}

