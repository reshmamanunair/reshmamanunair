package multilevelInheritance;

public class C2 extends C1 {
	public void welcome() {
		
		System.out.println("i am the child of c1");
	}

	public static void main(String[] args) {
		C2 obj=new C2();
		obj.display();
		obj.print();
		obj.welcome();
	}

}
