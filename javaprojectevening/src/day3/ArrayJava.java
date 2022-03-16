package day3;

public class ArrayJava
//single dimensional array
{
public static void main(String args[]) {
	int a[]=new int[5];//declaration array with  size 5,starting index is 0, last index is 4
	a[0]=100;
	a[1]=200;
	a[2]=300;
	a[3]=400;
	a[4]=500; //storing /inserting valves into array
	System.out.println(a.length);
	
	int b[]= {100,200,300,400,500}; //declare an array without specifying size
	System.out.println("length of an array:"+b.length);//prints length/size of an array
	System.out.println(b[2]);//read a specific valve
	//classic for loop
	for(int i=0;i<=b.length-1;i++)   //for(int i=0;i<5;i++),if we use(i<=4) then we have to write in (i<=a.length-1),likewise if we use(i<5) then we have to write in (i<a.length)
	{
		System.out.println(a[i]);	//100,200,300,400,500
	}
//advanced/enhanced for loop
for(int i:b) {
	System.out.println(i);//100,200,300,400,500
}
//multidimentinal array

int c[][]=new int[3][2];//here we specify the size of rows and columns
c[0][0]=100;
c[0][1]=200;

c[1][0]=300;
c[1][1]=400;

c[2][0]=500;
c[2][1]=600;
 System.out.println("number of rows:"+c.length);
 System.out.println("number of columns:"+c[0].length);

//the above multidimensional array prgm in another method without specifying the size we can directly assign the values
 
 int d[][]={{100,200},{300,400},{500,600}};
 
 System.out.println("number of rows:"+d.length);
 System.out.println("number of columns:"+d[0].length);

 
 for(int j=0;j<c.length;j++)     //outer loop 0 1 2
 {
	 for(int k=0;k<c[0].length;k++)    // inner loop 0 1 2	 
	 {
		 System.out.print(c[j][k] +" ");   //100 200 300 400 500 600
	 }
	 System.out.println();
 }


//enhanced for loop for multidimensional array (here we have rows and columns so we need two for loop)

for(int r[]:c) //100,200 ie 100 will assign to r then go to inner loop first 100 will read and assign to h and print the value likewise do for 200 
{
for(int h:r) //the c has multiple values so here i defined r[] a single dimensional array again from single dimensional array we can read values like this
{
System.out.println(h);	//100 200 300 400 500 600
}
}
}

}
