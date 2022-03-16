package encapsulationPrgms;

public class AdditionEncap {

	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.setAdd(65.3,85.3,45.3);
		System.out.println("The sum of the three double numbers area " +obj.getAdd());
	}

}
