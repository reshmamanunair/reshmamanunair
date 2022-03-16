package day3;

public class StringJava {
public static void main(String args[]) 
{
	//length() and concat() method prgms
	
String s="Welcome"; //also it will count the space(7) ie if there is a space then it will count as one character
String s1="to java";
System.out.println(s.length()); //length of a string 
System.out.println(s.concat(s1)); //joining of string

//trimming the sting using trim method

s="    welcome     ";   
System.out.println("before trimming string is:"+s);
System.out.println("after trimming  string is:"+s.trim());

//charAt()
s="Welcome";
System.out.println(s.charAt(4)); //returns characters based on index number,index will start from 0

//contains()---->always return true
s="Welcome";
System.out.println(s.contains("Wel"));//here we use capital letter (s=Welcome)
System.out.println(s.contains("wel"));//here we use samll letter(s=Welcome)
System.out.println(s.contains("com"));//we can check it in sequence

//comparing strings equals()
s="Welcome";
System.out.println(s.equals("Welcome"));//true
System.out.println(s.equals("Wel come"));//true
System.out.println(s.equals("welcome"));//false

//comparing strings equalsIgnoreCase()

System.out.println(s.equalsIgnoreCase("welcome"));//true

//replacing characters
 
s="Welcome to Java";
System.out.println(s.replace('o','i'));//Welcime ti Java
System.out.println(s.replace("Java","Selenium")); //Welcome to selenium


//extracting substring from main string
 
s="Welcome";
System.out.println(s.substring(0,4)); //Welc

//converting lower and upper case

s="WELCOME";
System.out.println(s.toLowerCase());

s="welcome";
System.out.println(s.toUpperCase());
}

}
