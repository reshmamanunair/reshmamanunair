package hirearcialInheritance;

public class C2 extends P1{
public void welcome() {
	System.out.println("I am the second child of parent P1");
	
	
}
	public static void main(String[] args) {
		C2 obj=new C2();
		
		
		obj.welcome();      //in hirearcial there is no relation ship between childrens
		obj.add(2,4);
		

	}

}
