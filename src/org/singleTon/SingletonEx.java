package org.singleTon;
class parent{
	int a=20;
	private parent() {}

	public static parent caller() {
		parent obj=new parent();
		return obj;
	}
}

public class SingletonEx {

	public static void main(String[] args) {
		parent obj=parent.caller();
		System.out.println(obj.a);
		obj.a=500;
		System.out.println(obj.a);
		parent obj2=parent.caller();
		System.out.println(obj2.a);

	}

}
