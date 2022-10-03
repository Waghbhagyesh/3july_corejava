package org.Constructor;
class Parent1{
	int a=10;
	public Parent1() {
		System.out.println("non Argm constr");
	}
	public void test() {
		System.out.println("from test");
	}
}
class Parent2 extends Parent1{
	int a=10;
	
	public Parent2() {
		super();
		super.test();
//		a=this.a;
		super.a=a;
		System.out.println("non Argm constr");
		
	}
	public void test1() {
		System.out.println("from test1");
	}

}

public class CallSameClassConstr extends Parent1 {
	public CallSameClassConstr() {//default hidden already 
		System.out.println("Default Constructor");
	}
	public CallSameClassConstr(int a) {
		this((byte)50);
		System.out.println("Para-Int Constructor");
	}
	public CallSameClassConstr(byte b) { 
		this('A');
		System.out.println("Para-Byte Constructor");
	}
	public CallSameClassConstr(float x,double y) {
		this((long)545454);
		System.out.println("Para-FloatDouble Constructor");
	}
	public CallSameClassConstr(long d) {
		this(true);
		System.out.println("Para-Long Constructor");
	}
	public CallSameClassConstr(char ch) {
		this(77.99f,88.78d);
		System.out.println("Para-charecter Constructor");
	}
	public CallSameClassConstr(boolean flag) {
		this();
		System.out.println("Para-Boolean Constructor");
	}
	

	public static void main(String[] args) {
	
//		CallSameClassConstr org2=new CallSameClassConstr(786);

	}

}
