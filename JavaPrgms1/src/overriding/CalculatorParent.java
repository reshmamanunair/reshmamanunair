package overriding;

public class CalculatorParent {
int ans;
public void add(int a,int b) {
	
	ans=a+b;
	System.out.println("The addition of two numbers in parent class" +ans);
}
public void sub(int x,int y) {
	ans=x-y;
	System.out.println("The subtraction of two numbers in parent class " +ans);
	
}
}
