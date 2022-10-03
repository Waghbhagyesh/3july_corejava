package org.Programs;

public class Pallindrom_Num {

	public static void main(String[] args) {
		int num=57986;
		int rev=0;
		for(int i=0;i<num;i++){
			int M=num%10;
			rev=rev*10+M;
			num=num/10;
		}
		System.out.println("revers num = "+rev);
	}
}

