package lambda;

@FunctionalInterface
interface Test{
	
	public void sum(int a, int b);
}


public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		
		//Anonymous function
		
//		Test t1 = new Test() {
//			public void sum(int a, int b) {
//				System.out.println(a+b);
//			}
//		};
		
		//implementing the abstract method of functional interface using lambda expression
		Test t1 = (a,b)->System.out.println(a+b); 
		
		t1.sum(10, 20); //calling the abstract method of the functional interface

	}

}
