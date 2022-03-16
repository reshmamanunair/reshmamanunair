package suPer;

public class C1 extends P1{
int sum;
public void add(int a,int b) {
	super.add(12,25);
	sum=a+b;
	System.out.println("The sum of values in child class " +sum);
	
	
	
}
	public static void main(String[] args) {
	
		C1 obj=new C1();
		obj.add(2,3);
	}

}
