package interfaceprgm;

public class Calculator1Calculator2Interface implements Calculator1,Calculator2{
	int ans;
	public void add(int a,int b) {
	ans=a+b;
	System.out.println("The addition of two numbers are " +ans);
	}
	public void sub(int a,int b) {
		ans=a-b;
		System.out.println("The subtraction of two numbers are " +ans);	
	}
	public void mul(int a,int b) {
		ans=a*b;
		System.out.println("The multiplication of two numbers are " +ans);
	}
	public void div(int a,int b) {
		ans=a/b;
		System.out.println("The division of two numbers are " +ans);	
	}
	public static void main(String[] args) {
		Calculator1Calculator2Interface obj=new Calculator1Calculator2Interface();
		obj.add(12,13);
		obj.sub(52,13);
		obj.mul(11,13);
		obj.div(22,11);
	}

}
