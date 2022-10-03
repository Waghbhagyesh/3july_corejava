package org.Programs;

public class SwapingWithThirdVariable {

	public static void main(String[] args) {
		SwapingWithThirdVariable swap=new SwapingWithThirdVariable();
		swap.WithThirdVariable();
		swap.WithoutThirdVariable();
	}
	public void WithThirdVariable() {
		int a=10;
		int b=20;
		int temp;

		temp=a;
		a=b;
		b=temp;
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}
	public void WithoutThirdVariable() {
		int a=10;
		int b=20;
		b=b-a;
		a=b+a;
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}
}



