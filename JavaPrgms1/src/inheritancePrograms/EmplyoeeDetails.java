package inheritancePrograms;

public class EmplyoeeDetails extends EmplyoeeDisplay{

	public static void main(String[] args) {
		
		EmplyoeeDetails obj=new EmplyoeeDetails();
		
		obj.emplyoee("nila","csc",123);
		obj.salary(5000,5000);
		
		obj.emplyoee("mila","ece",125);
		obj.salary(3000,5000);
		
		obj.emplyoee("jila","eee",144);
		obj.salary(4000,5000);
		
		obj.emplyoee("tila","mech",253);
		obj.salary(6000,5000);
	}

}
