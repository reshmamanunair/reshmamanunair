package hirearcialInheritance;

public class ChildDiv2 extends ParentFloatModDiv {

public void div() {
	ans=x/y;
	System.out.println("The division of two numbers are " +ans);
	
}
	public static void main(String[] args) {
		ChildDiv2 obj=new ChildDiv2();
		obj.div();
		

	}

}
