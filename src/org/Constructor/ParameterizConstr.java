package org.Constructor;

public class ParameterizConstr {
	public ParameterizConstr() {//default hidden already 
		System.out.println("Default Constructor");
	}
	public ParameterizConstr(int a) {
		System.out.println("Para-Int Constructor");
	}
	public ParameterizConstr(byte b) { 
		System.out.println("Para-Byte Constructor");
	}
	public ParameterizConstr(float x,double y) {
		System.out.println("Para-FloatDouble Constructor");
	}
	public ParameterizConstr(long d) {
		System.out.println("Para-Long Constructor");
	}
	public ParameterizConstr(char ch) {
		System.out.println("Para-charecter Constructor");
	}
	public ParameterizConstr(boolean flag) {
		System.out.println("Para-Boolean Constructor");
	}
	
	

	public static void main(String[] args) {
	
//		ParameterizConstr org1=new ParameterizConstr();
//		ParameterizConstr org2=new ParameterizConstr(786);
//		ParameterizConstr org3=new ParameterizConstr((byte)10);
//		ParameterizConstr org4=new ParameterizConstr(77.55f,78.90d);
//		ParameterizConstr org5=new ParameterizConstr(774182836);
//		ParameterizConstr org6=new ParameterizConstr('A');
	}

}
