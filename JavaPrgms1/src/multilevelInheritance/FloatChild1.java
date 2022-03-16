package multilevelInheritance;

public class FloatChild1 extends ParentFloat {
	float diff;
	public void sub() {
		
		diff=a-b;
		System.out.println("the value of a is" +a);
		System.out.println("the value of b is " +b);
		
		
	}

	public static void main(String[] args) {
		
		FloatChild1 obj=new FloatChild1();
		obj.sub();
	}

}
