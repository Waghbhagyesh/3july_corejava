package org.Abstract;
abstract class Parent{
	public Parent() {
		System.out.println("super");
	}
	abstract public void test();
	public void test2()
	{System.out.println("from Test 2");
	}
}

public class Ex1 extends Parent {
	public Ex1(){
		super();
		super.test2();
	}
	public void test() {
		System.out.println("From Test");
	}
	public void test2()
	{System.out.println("from Test 444");
	}

	public static void main(String[] args) {
		Ex1 obj=new Ex1();

		obj.test();
		obj.test2();

	}

}
