package abstractionprgm;

public class Sample1Child extends Sample1{
	int sum;
	public  void add(int a,int b) {
	System.out.println("The abstract method extends here");
	System.out.println("**********************");
	sum=a+b;
	System.out.println("The sum of the numbers are" +sum);
	
		
		
	}
	public static void main(String[] args) {
		Sample1Child obj=new Sample1Child();
		obj.add(12,13);
obj.disp();
	}

}
