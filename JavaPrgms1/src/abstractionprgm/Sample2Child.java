package abstractionprgm;

public class Sample2Child extends Sample2{
	public void disp() {
		System.out.println("hiii");
	}
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		
		Sample2Child obj=new Sample2Child();
		obj.disp();
		obj.print();
	}

}
