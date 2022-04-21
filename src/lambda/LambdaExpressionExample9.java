package lambda;

import java.util.function.BiConsumer;

public class LambdaExpressionExample9 {
	
//	public void add(Integer a, Integer b) {
//		System.out.println(a+b);
//	}

	public static void main(String[] args) {
		
		//BiConsumer is a predefined functional interface
		
		BiConsumer<Integer, Integer> biConsumer = (a,b)->System.out.println(a+b);	
		biConsumer.accept(7, 8);

			
//		LambdaExpressionExample9 obj = new LambdaExpressionExample9();
//		obj.add(5, 6);
		
	}
	


}
