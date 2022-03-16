package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Sample3 {

	public static void main(String[] args) {
		LinkedList<Integer> a1=new LinkedList<Integer>();
		LinkedList<Integer> a2=new LinkedList<Integer>();
	
	a1.add(11);
	a1.add(12);
	a1.add(13);
	a1.add(14);
	System.out.println("First integer linked List");
	System.out.println(a1);
	a2.add(101);
	a2.add(111);
	a2.add(112);
	a2.add(113);
	System.out.println("Second  integer linked List");
	System.out.println(a2);
	a1.addAll(a2);
	System.out.println(a1);
	Iterator<Integer> itr=a1.iterator();
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
	}
	
	}
	
	

}
