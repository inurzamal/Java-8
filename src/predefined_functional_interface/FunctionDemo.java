package predefined_functional_interface;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		
		//Function<T, R> here first T is input type, second parameter R is return type
		
		Function<String, Integer> result = r -> r.length();
		Integer len = result.apply("Hello");
		System.out.println(len); // 5
	}
}
