package org.Programs;

public class Star {

	public static void main(String[] args) {
		//upper star
		for(int a=1;a<6;a++) {
			for(int b=6-a;b>0;b--) {
				System.out.print(".");
			}
			for(int c=(a-1);c>0;c--) {
				System.out.print(" *");
			}
			System.out.println(" ");
		}
		
		//lower star
		for(int i=1;i<6;i++) {

			for(int j=(i-1);j>0;j--) {
				System.out.print(" ");
			}
			for(int k=6-i;k>0;k--) {
				System.out.print(" *");
			}
			System.out.println("");

		}

	}

}
