package multilevelInheritance;

public class FloatChild2 extends FloatChild1{
public void disp() {
	
	System.out.println("the subtraction of two numbers are " +diff);
	
}
	public static void main(String[] args) {
		FloatChild2 obj=new FloatChild2();
		obj.sub();
		obj.disp();
		

	}

}
