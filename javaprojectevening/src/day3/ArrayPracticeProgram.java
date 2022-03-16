package day3;

public class ArrayPracticeProgram {
	public static void main(String args[]) 
	{
		
	//prgm to find sum values of an array
		
		int a[]= {7,8,3,4,5,9}; //n=6   ,n-1=5
		 int sum=0;
		 for(int i=0;i<=a.length-1;i++) //0 1 2 3 4 5  //a.length-1=5 (classic for loop)
			 
		 {
			sum=sum+a[i]; //7+8+3+4+5+9
		 }
			 
			 System.out.println("sum of an array:" +sum);
		
			 //enhanced for loop
			 
			 int sum1=0;
		 
			 for(int value:a)
			 {
				 sum1=sum1+value;
				 
			 }
			 System.out.println("sum of an array:" +sum1);
			 
		//prgm to search specific number in an array
			 
			 int b[]= {90,80,39,45,56,34};
			 
			 System.out.println(b[2]);
			 
			 
			 //prgm to search specific string in an array
			 

			 /*String c[]= {"AA","BB","CC","DD","EE"};
			 System.out.println(c[0]);
			 
			 System.out.println("Enter a search value:");
			 
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 String line;
			 line = br.readLine();
			 
			     System.out.println(String.format("The input is: %s", line));
			     for(int i = 0;i<c.length;i++)
			     {
			    	 if(c[i].equals(line))
			    	 {
			    		 System.out.println("Value found at position :" +i);
			    	 }
			    	 else
			    	 {
			    		 System.out.println("Value not found at :"+i); 
			    	 }
			    	
			     }*/
			 

			 
			// want to complete this prgm
			     //(define an array with some string values,write a prgm to search specific number in an array)
			 
			 /*String s[]= {"Welcome"};
			
			 
			 for(int k=0;k<a.length;k++))
			 {
				 System.out.println(s[k]);
			 }
					 
			 
			 */
			 //progm to print odd and even numbers in an array    
			
			 int f[]= {10,20,5,7,40};
			for(int h=0;h<f.length;h++)
			{
				if(f[h]%2==0)
				{
				System.out.println("even numbers"+f[h]);
			}
			if(f[h]%2!=0)
			{
				System.out.println("odd numbers"+f[h]);
			}
		
			}
	
	
	
	//prgm to find greatest and smallest number in an array
			
			int u[]= {39,84,10,70,25};
			int max=u[0]; //39
			for(int l=1;l<u.length;l++) //84
			{
				if(u[l]>max) //84>39
				{
					max=u[l]; //84
					System.out.println("the greatest number is"+max);
				}}
				int min=u[0];//39
			for(int g=1;g<u.length;g++)//84,10
			{
				if(u[g]<min) //84<39,10<39
				{
			
		min=u[g]; //10
			System.out.println("the smallest number is"+min);
			}
			
			}
	
	
			
			
			//program to add two matrices(have doubt in this prgm)
			
			int e[][]= {{78,98,73},{34,74,33},{32,83,33}};
			int z[][]= {{63,37,32},{63,37,54},{26,82,33}};
			int c[][]= new int[3][3];
			for(int t=0;t<3;t++)
			{
				for(int d=0;d<3;d++)
			{
				c[t][d]=e[t][d]+z[t][d];
				System.out.print(c[t][d]+ " ");
			}
			System.out.println();
			}
			}
			
		}
	
	
	
	
			
	
	


	


