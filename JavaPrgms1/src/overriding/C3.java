package overriding;

public class C3 extends P2 {
	int sum;
	public void add(int a,int b) {
		 sum=a+b;
		System.out.println("The sum of the numbers in chid class " +sum);
		
		
	}

	public static void main(String[] args) {
		C3 obj=new C3();
		obj.add(4,5);

	}

}
