package abstractionprgm;

public class ReverseAbstractChild extends ReverseAbstract {
	int d,rev=0;
public void rev(int num) {
	System.out.println("The given number is :" +num);
	while(num!=0) {
		d=num%10;
		rev=rev*10+d;
		num=num/10;
		
	}
	
	System.out.println("The reverse number is :" +rev);
}
	public static void main(String[] args) {
		ReverseAbstractChild obj=new ReverseAbstractChild();
		obj.rev(125);

	}

}
