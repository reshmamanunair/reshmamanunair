package interfaceprgm;

public class Sample1Child implements Sample1 {
	public void sam() {
		
		System.out.println("i am the child");
	}

	public static void main(String[] args) {
		
		Sample1Child obj=new Sample1Child();
		obj.sam();
	}

}
