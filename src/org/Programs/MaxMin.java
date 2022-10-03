package org.Programs;

public class MaxMin {

	public static void main(String[] args) {

		int [] arr = {1, 45, 67, 7896, 98, 455, 678};
		int max = Integer.MIN_VALUE; 
		for ( int element : arr){
			if(element>max){ 
				max=element;
			}
		}
		System.out.println("Max element is = " + max);
	
		
	 int [] arr1 = {1, 45, 67, 98, 455, 678,-6};
		int min = Integer.MAX_VALUE;
		for ( int element : arr1){ 
			if(element<min){ 
				min=element;
			}
		}
		System.out.println("Min element is = " + min);
		


	}
}
