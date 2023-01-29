/*
 * Consumer is a functional interface having only one abstract method void accept(T t), 
it takes single input of any type as a parameter and returns nothing.
*
*/
package predefined_functional_interface;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

	 
		Consumer<Integer> consumer = i -> System.out.println(i*i);	
		consumer.accept(6);
		
		Consumer<String> consumer2 = ConsumerDemo::greet;
		consumer2.accept("Ryan"); // Hello Ryan
		
	}

	private static void greet(String name) {
		System.out.println("Hello "+ name);
	}

}
