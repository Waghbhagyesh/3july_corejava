package org.Programs;

public class StringEx {
	public static void main(String []args) {

		//StringBuffer Class its mutable 
//		StringBuffer sb=new StringBuffer("hey buddie");
//		System.out.println(sb);
//		sb.reverse();
//		System.out.println(sb);
		
		String sample="I Love India";
		System.out.println(sample.length());
		System.out.println(sample.charAt(2));
		System.out.println(sample.substring(2));
		System.out.println(sample.indexOf('I'));
		
		String str1=new String("Pune");
		String str2="Pune";
		String str3= new String("Pune");
		String str4="Mumbai";
		String str5=str2;
		// .equal method
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		
		// == method
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1==str4);
		System.out.println(str5==str2);
		
		
	}
}
