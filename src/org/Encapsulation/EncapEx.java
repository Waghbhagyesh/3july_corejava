package org.Encapsulation;
class Encap{
	private int x=10;
	
	public  int get() {
		return x;
	}
	public void set(int a) {
		x=a;
	}
}

public class EncapEx {

	public static void main(String[] args) {
		Encap obj=new Encap();
		System.out.println(obj.get());
		obj.set(500);
		System.out.println(obj.get());
	}

}
