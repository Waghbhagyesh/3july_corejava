package org.Abstract;

public class JavaTest {

	public static void main(String[] args) {
		String str= "Bhagy^s!h..@tr!";
		int count=0;

		for (int i=0;i<str.length();i++) {
			if (!Character.isDigit(str.charAt(i))
					&& !Character.isLetter(str.charAt(i))
					&& !Character.isWhitespace(str.charAt(i))) {
				
				count++;
			}
		}
		if (count == 0)
			System.out.println(
					"No Special Characters found.");
		else

			System.out.println(
					"String has Special Characters\n" + count + " "
							+ "Special Characters found.");
	}


}


