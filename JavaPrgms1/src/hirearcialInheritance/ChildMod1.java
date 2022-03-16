package hirearcialInheritance;

public class ChildMod1 extends ParentFloatModDiv {
	
public void mod() {
	
	ans=x%y;
	System.out.println("The modulus of two numbers are " +ans);
}
	public static void main(String[] args) {
		ChildMod1 obj=new ChildMod1();
		obj.mod();
		
	}

}
