package multilevelInheritance;

public class C1 extends P1 {
public void print() {
	
	System.out.println("i am child class");
	System.out.println("my base class is parent1");
	
}
	public static void main(String[] args) {
		C1 obj=new C1();
		obj.display();
		obj.print();
	}

}
