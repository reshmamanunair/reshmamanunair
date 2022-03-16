package opps;

public class Employee {
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	void display() 
	{
		
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
		}
	public static void main(String args[])
	{
		Employee emp1=new Employee();
		emp1.eid=425;
		emp1.ename="david";
		emp1.sal=45000.52;
		emp1.deptno=152;
		emp1.job="lead";
		emp1.display();
		
	
		
	
	Employee emp2=new Employee();
	emp2.eid=852;
	emp2.ename="mahi";
	emp2.sal=422.55;
	emp2.deptno=445;
	emp2.job="manager";
	emp2.display();

	}
	}


