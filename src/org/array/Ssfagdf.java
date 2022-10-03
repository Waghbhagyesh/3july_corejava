package org.array;

public class Ssfagdf {

	public static void main(String[] args) {
		String str="nayan",reversestr="";
		int strlenghth=str.length();
		for(int i=(strlenghth-1);i>=0;i--){
		reversestr=reversestr+str.charAt(i);
		}
		if(str.toLowerCase().equals(reversestr.toLowerCase())){
		System.out.println("String is pallindrom");
		}else{
		System.out.println("String is not pallindrom");
		}

	}

}
