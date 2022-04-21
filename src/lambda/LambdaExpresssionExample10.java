package lambda;

import java.util.Comparator;

public class LambdaExpresssionExample10 {

	public static void main(String[] args) {
		
		Comparator<String> c = (s1,s2)->s1.compareTo(s2);
		
		System.out.println(c.compare("Hello", "Hello"));

	}

}



