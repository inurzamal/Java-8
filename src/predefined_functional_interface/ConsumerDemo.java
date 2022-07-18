package predefined_functional_interface;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

//		ConsumerDemo consumerDemo = new ConsumerDemo();
//		consumerDemo.squareInt(5);
		
		
		//Consumer is a functional interface having only one abstract method void accept(T t), it takes single input of any type as a parameter and returns nothing 
		Consumer<Integer> consumer = i -> System.out.println(i*i);	
		consumer.accept(6);
		
	}

//	private void squareInt(int i) {
//		System.out.println("Square is: "+i*i);		
//	}

}
