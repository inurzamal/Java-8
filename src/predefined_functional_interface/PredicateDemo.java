package predefined_functional_interface;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> p = a->(a>10);
		System.out.println(p.test(5));
	}
}
