package constructor;

public class StudentGrade {
	
	int total,avg;
	public StudentGrade(String name,int mark1,int mark2,int mark3) 
	{
		total=mark1+mark2+mark3;
		avg=total/3;
		System.out.println("The name of the student is " +name);
		System.out.println("The total mark of the student is:" +total);
		System.out.println("The average mark of the student is :" +avg);
	
		
		if(avg>90)
		{
			System.out.println("the student grade is A");
		}
		else if(avg<=80 && avg>=70)
		{
			System.out.println("the student grade is B");
			
		}
		else if(avg<=70 && avg>=60)
		{
			System.out.println("the student grade is C");
			
		}
		else if(avg<=60 && avg>=50)
		{
			System.out.println("the student grade is D");
			
		}
		else 
		{
			System.out.println("The student is failed");
			
		}
		System.out.println("*********************************");
}
		
		
	
	

	public static void main(String[] args)
	{
		StudentGrade obj=new StudentGrade("nila",60,70,80);
		
		StudentGrade obj1=new StudentGrade("lila",80,70,50);
		
		StudentGrade obj2=new StudentGrade("kila",20,10,10);
		
	}

}
