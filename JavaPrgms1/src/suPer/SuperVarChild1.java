package suPer;

public class SuperVarChild1 extends SuperVarParent1{
	public void display() {
		/*int b=super.a;
		System.out.println(b);*/
		
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		
		SuperVarChild1 obj=new SuperVarChild1();
				obj.display();
	}

}
