package org.Encapsulation;
class A{
	private int accountNo,balance;    //private date can be access to other class using encapsulation
 
	public void setAc(int a) {
		accountNo=a;
	}

	public void setBl(int b) {
		balance=b;
	}
	public int getAc() {
		return accountNo;
	}
	public int getBl() {
		return balance;
	}

}
public class EncapsulationEx1 {

	public static void main(String[] args) {
		A obj=new A();
		System.out.println("Default Acc no :"+obj.getAc());
		obj.setAc(375050);
		System.out.println("Original set acc no :"+obj.getAc());

		System.out.println("Default Bal no :"+obj.getBl());
		obj.setBl(50500);
		System.out.println("Original set Bal no :"+obj.getBl());

	}

}
