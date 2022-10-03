package org.Programs;

public class DuplicateCharFrStr2 {

	public static void main(String[] args) {

		String str="Good morning Bhagyesh";
		int count;
		char String[]=str.toCharArray();
		
		for(int i=0;i<String.length;i++) {
			count=1;
			for(int k=i+1;k<String.length;k++) {
				if(String[i]==String[k] && String[i]!=' ') {
					count++;
					String[k]='0';
				}
			}
			if(count>1 && String[i]!='0') {
				System.out.println(String[i]);
			}
		}

	}
}


