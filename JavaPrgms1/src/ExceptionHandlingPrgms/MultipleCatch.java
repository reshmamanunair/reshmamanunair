package ExceptionHandlingPrgms;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[7]=30/6;
			
			
		}
		catch(ArithmeticException e) {
		System.out.println("Arithmetic exception occurs");
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
			
			}
		catch(Exception e) {
			System.out.println("parent exception occurs");
			
			}
		System.out.println("Rest of the code");

	}

}
