package predefined_functional_interface;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> p = a->(a>10);
		System.out.println(p.test(5));
		
		Predicate<Integer> e = PredicateDemo::isEven;
		System.out.println(e.test(8));
	}
	
	private static boolean isEven(int n) {
		if(n%2==0)
			return true;
		return false;
	}
}
