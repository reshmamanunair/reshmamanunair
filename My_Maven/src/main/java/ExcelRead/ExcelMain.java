package ExcelRead;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		String s1=ExcelCode.readStringData(1,0);
		System.out.println(s1);
	String s2=ExcelCode.readIntegerData(1,1);
	System.out.println(s2);
	}

}
