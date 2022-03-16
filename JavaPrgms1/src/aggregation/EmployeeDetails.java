package aggregation;

public class EmployeeDetails {
	
	String name,dept;
	int id,sal;
	EmployeeAddress obj;
	public void details(String name1,String dept1,int id1,int sal1 ,EmployeeAddress obj1) {
		
		this.name=name1;
		this.dept=dept1;
		this.id=id1;
		this.sal=sal1;
		this.obj=obj1;
		
	}
	public void display() {
		System.out.println("Name of the employee is: " +name);
		System.out.println("Department of the employee is :" +dept);
		System.out.println("The ID of the Employee is :" +id);
		System.out.println("The salary of the Employee is :"+sal);
		System.out.println("The address line1 is : "+ obj.address1);
		System.out.println("The address line2 is : "+obj.address2);
		System.out.println("The street is :"+ obj.street);
		System.out.println("The district is:"+obj.dis);
		System.out.println("The pin is :"+obj.pin);
		System.out.println("************");
		
		
	}

	public static void main(String[] args)
	{
		
		EmployeeAddress obj3=new EmployeeAddress();
		obj3.address("hilandsranch","parker","colorado","denver",122);
		EmployeeDetails obj2=new EmployeeDetails();
		obj2.details("nila","eee",12,15545,obj3);
		obj2.display();
		
		
		EmployeeAddress obj4=new EmployeeAddress();
		obj4.address("hilandsranch","parker","colorado","denver",122);
		EmployeeDetails obj5=new EmployeeDetails();
		obj5.details("jila","cse",15,15545,obj4);
		obj5.display();
		
		EmployeeAddress obj6=new EmployeeAddress();
		obj6.address("hilandsranch","parker","colorado","denver",122);
		EmployeeDetails obj7=new EmployeeDetails();
		obj7.details("tila","ece",15,1555,obj4);
		obj7.display();
		
		EmployeeAddress obj8=new EmployeeAddress();
		obj8.address("hilandsranch","parker","colorado","denver",122);
		EmployeeDetails obj9=new EmployeeDetails();
		obj9.details("alina","cse",15,15355,obj4);
		obj9.display();
		
		
	}

}
