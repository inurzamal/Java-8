package newQ;

import java.util.Arrays;

public class SortCharacter {

	public static void main(String[] args) {

		String str = "hello";
		
		char[] charArray = str.toCharArray();
		
		Arrays.sort(charArray);
		
		str = new String(charArray);
		
		System.out.println(str);

	}
}
