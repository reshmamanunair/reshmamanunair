package aggregation;

public class StudentDetails 
{
String id,name;
StudentAddress s;
public void details(String id1,String name1,StudentAddress s1)
{
	
	this.id=id1;
	this.name=name1;
	this.s=s1;
	
	
	
}
public void disp()
{
	
	
	System.out.println(s.addLine1);
	System.out.println(s.addLine2);
	System.out.println(s.street);
	System.out.println(s.pin);
	System.out.println(id);
	System.out.println(name);
	System.out.println("********");
	//System.out.println(addr);
	
}

	public static void main(String[] args) 
	{
		StudentAddress obj1=new StudentAddress();
		obj1.address("highlandsranch","parker","fallane",2012);
		StudentAddress obj3=new StudentAddress();
		obj3.address("hnjjh","pjjj","fane",2012);
		StudentDetails obj2=new StudentDetails();
		
		obj2.details("eee","reshma",obj1);

		obj2.disp();
StudentDetails obj4=new StudentDetails();
		
		obj4.details("eg","rhma",obj1);
		obj4.disp();
		
	}

}
