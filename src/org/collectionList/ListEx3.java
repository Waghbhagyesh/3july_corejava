package org.collectionList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListEx3 {

	public static void main(String[] args) {

		//   List_Iterator  concept
		//Heterogeneous Object Creation
		ArrayList<Object> arr=new ArrayList<Object>();

		System.out.println(arr.isEmpty());

		arr.add("pune");
		arr.add(23);
		arr.add(new Integer(77));             //WrapperClass
		arr.add('c');
		arr.add(2, 88);
		System.out.println(arr);
		
		System.out.println("----------");
		System.out.println(arr.size());
		System.out.println("----------");
		
		ListIterator <Object>itr=arr.listIterator();
		System.out.println(itr.hasNext());
		System.out.println(itr.nextIndex());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		System.out.println(itr.hasPrevious());
		System.out.println(itr.previousIndex());
		System.out.println(itr.previous());

	


	}

}
