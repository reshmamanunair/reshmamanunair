package day2;

public class Conditionalstatements {
	public static void main(String args[])
	{
	int age=20;
	if(age>=18)
	{
		System.out.println("eligible for vote");
	}
	else
	{
		System.out.println("not eligible for vote");
	}
	

//program to check number is even or not

int num=10;
if(num%2 ==0)
{
	System.out.println("number is even");
}
	else {
		System.out.println("number is odd");	
	}
	
//program to find largest of two numbers

int g=10;
int u=40;
if(g>u)
{
System.out.println("g is largest");

}
else
{
	System.out.println("u is largest");
}

//Nested if else condition based on the number provided it should display the week name

int day=3;
if(day==1)
{
System.out.println("sunday");
}
else if(day==2) {
	System.out.println("monday");
	
}
else if(day==3) {
	System.out.println("tuesday");
	
}
else if(day==4) {
	System.out.println("wednesday");
	
}
else if(day==5) {
	System.out.println("thursday");
	
}
else if(day==6) {
	System.out.println("friday");
	
}
else if(day==7) {
	System.out.println("saturday");
	
}
else
{
System.out.println("invalid week");	
}
	

//switchcase condition based on the number provided it should display the week name

int days=3;
switch(days)
{
case 1:System.out.println("sunday");break;
case 2:System.out.println("monday");break;
case 3:System.out.println("tuesday");break;
case 4:System.out.println("wednesday");break;
case 5:System.out.println("thursday");break;
case 6:System.out.println("friday");break;
case 7:System.out.println("saturday");break;
default:System.out.println("invalid week");

}
//program to print 1 to 10 numbers

int j=1;
while(j<=10)
{
System.out.println(j);
j++;
}

//progm to print even numbers between 1 to 10

int k=2;
while(k<=10)
{
	System.out.println(k);
	k+=2;  //k=k+2;
	
}
//progm to print odd numbers between 1 to 10

int m=1;
while(m<=10)
{
	System.out.println(m);
	m+=2;  //m=m+2;
	
}

//progm to print 1 to 10 in decending order
int h=10;
while(h>0)
{
System.out.println(h);
h--;
}
//progm to print 1 to 10  numbers in do while loop
 
int v=1;
do
{
System.out.println(v);
v++;

}while(v<=10);
//same as above do while loop progm bt have small difference 
 
int s=20;
do
{
System.out.println(s);//even though the condition is not match it will print 20 then it increment the value and check the condition
s++;

}while(s<=10);
//prgm to print 1 gto 10 numbers accending order

for(int d=1;d<=10;d++) {
	System.out.println(d);
}
//prgm to print 1 to 10 numbers in decending order

for(int d=10;d>0;d--) {
	System.out.println(d);
}

//prgm for print 1 to 10 numbers using jumping statements(break)
 
for(h=1;h<=10;h++)
{
	
if(h==5) //after checking the above condition h<=10 it will check the if condition is true or not ie h==5
{
break;	
}
System.out.println(h);
}
//prgm for print 1 to 10 numbers using jumping statements(continue)

for(int f=1;f<=10;f++)
{
	
if(f==5) //after checking the above condition r<=10 it will check the if condition is true or not ie r==5
{
continue;	//means it will print 1,2,3,4,6,7,8,9,10 ie it will skip 5 and remaing will print
}
System.out.println(f);
}
	
//prgm for print 1 to 10 numbers using jumping statements(continue) bt to skip 3,5,7

for(int t=1;t<=10;t++)
{
	
if(t==3 || t==5 || t==7) //after checking the above condition r<=10 it will check the if condition is true or not ie r==5
{
continue;	//means it will print 1,2,3,4,6,7,8,9,10 ie it will skip 5 and remaing will print
}
System.out.println(t);
}

	}}

