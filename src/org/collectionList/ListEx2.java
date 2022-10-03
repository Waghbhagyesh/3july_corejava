package org.collectionList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListEx2 {

	public static void main(String[] args) {

		//Heterogeneous Object Creation
		ArrayList<Object> arr=new ArrayList<Object>();
		arr.add("pune");
		arr.add(23);
		arr.add(new Integer(77));             //WrapperClass
		arr.add('c');
		System.out.println(arr);
		arr.add(2, 88);
		System.out.println(arr);
		System.out.println(arr.size());
		arr.remove(2);
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.isEmpty());
		ListIterator <Object>itr=arr.listIterator();
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.nextIndex());


	}

}
