package abstractionprgm;

public class CalculatorChild extends Calculator {
	int ans;
	public void add(int a,int b) {
		ans=a+b;
		System.out.println("The addition of two numbers are :" +ans);
	}
	public void sub(int a,int b) {
		ans=a-b;
		System.out.println("The subtraction of two numbers are :" +ans);
	}
	public void mul(int a,int b) {
		ans=a*b;
		System.out.println("The multiplication of two numbers are :" +ans);
	}
	public void div(int a,int b) {
		ans=a/b;
		System.out.println("The division of two numbers are :" +ans);
	}


	public static void main(String[] args) {
		CalculatorChild obj=new CalculatorChild();
		obj.add(23,25);
		obj.sub(63,25);
		obj.mul(23,45);
		obj.div(25,25);

	}

}
