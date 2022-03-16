package overriding;

public class CalculatorChild1 extends CalculatorParent {
	public void add(int a,int b) {
		
		ans=a+b;
		System.out.println("The addition of two numbers in child class " +ans);
	}
	public void sub(int x,int y) {
		ans=x-y;
		System.out.println("The subtraction of two numbers in child class " +ans);
		
	}
	public void mul(int a,int b) {
		ans=a*b;
		System.out.println("The multiplication of two numbers are " + ans);
		
	}
	public void div(int x,int y) {
		
		ans=x/y;
		System.out.println("The divistion of two numbers are " + ans);
		
	}
	public void mod(int a,int b) {
		
		ans=a%b;
		System.out.println("The modulus of two numbers are " + ans);
	}
	public static void main(String[] args) {
		CalculatorChild1 obj=new CalculatorChild1();
		obj.add(12,23);
		obj.sub(15,23);
		obj.mul(12,63);
		obj.div(62,23);
		obj.mod(12,25);
	}

}
