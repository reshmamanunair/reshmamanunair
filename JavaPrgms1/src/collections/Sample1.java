package collections;

import java.util.LinkedList;

public class Sample1 {

	public static void main(String[] args) {
		LinkedList<String> a1=new LinkedList<String>();
		a1.add("ABC");
		a1.add("def");
		a1.add("ghi");
		a1.add("jkl");
		System.out.println(a1);
		System.out.println(a1.size());
		a1.add("Reshma");
		System.out.println(a1);
		a1.remove("Reshma");
		System.out.println(a1);
		a1.removeAll(a1);
		

	}

}
