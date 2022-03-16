package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample4 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("jkl");
		list.add("mno");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(12);
		list1.add(23);
		list1.add(22);
		System.out.println(list1);
		Iterator itr1=list1.iterator();
		System.out.println("Integer array list traversing");
		while(itr1.hasNext()) {
			
			System.out.println(itr1.next());
		}
		Iterator itr=list.iterator();
		System.out.println("Array array list traversing");
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}
