package newQ;

import java.util.Comparator;

public class ReverseDemo {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		Comparator<Character> comp = (c1,c2)->c2.compareTo(c1);
		
		str.chars().mapToObj(c->(char)c).sorted(comp).forEach(System.out::print);
	
	}

}
