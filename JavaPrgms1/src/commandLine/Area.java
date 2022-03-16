package commandLine;

public class Area {
	
	int area;
public void areacircle(double r) {
	
	
	double area=(3.14*r*r);
	System.out.println("The area of the circle is :" +area);
}
public void areasquare(int a) {
	
	area=a*a;
	System.out.println("The area of the circle is :" +area);
}
public void arearectangle(int l,int w) {
	
	area=l*w;
	System.out.println("The area of the circle is :" +area);
}
	public static void main(String[] args) 
	{
		double r=Double.parseDouble(args[0]);
		
		int a=Integer.parseInt(args[1]);
		
		int l=Integer.parseInt(args[2]);
		int w=Integer.parseInt(args[3]);
		
		
Area obj=new Area();
obj.areacircle(r);
obj.areasquare(a);
obj.arearectangle(l,w);
	}

}
