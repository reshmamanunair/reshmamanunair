package day3;

public class StringPracticeJava {
	public static void main(String args[]) {
	
		//prgm to compare two strings ,ignoring case difference
	
		String s="Myworld";
	System.out.println(s.equalsIgnoreCase("myworld"));

//prgm to concatenate a given string to the end of another string
	
	s="Myworld";
	String s1=" Is different ";
	
	System.out.println(s.concat(s1));
	
	//prgm to get  the length of the given string
	
	s="Myworld";
	System.out.println(s.length());
	
	//prgm to get a subtring of a given string between two specified position
	
	s="Myworld";
System.out.println(s.substring(0,5));
 

//prgm to convert all the characters in a string to upper case

s="Myworld";
System.out.println(s.toUpperCase());



//prgm to convert all the characters in a string to lower case

s="Myworld";
System.out.println(s.toLowerCase());


	}}


