package interfaceprgm;

public class AddClassInterface implements Add{
int sum;
public void add(int a,int b) {
	sum=a+b;
	System.out.println("The sum of the values area " +sum);
}
	public static void main(String[] args) {
		
		AddClassInterface obj=new AddClassInterface();
		obj.add(12,13);
	}

}
