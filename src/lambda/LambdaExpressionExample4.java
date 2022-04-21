/*
 * In Java lambda expression, if there is only one statement, you may or may not use curly braces 
 * You must use curly braces when using multiple statements or return keyword.
 */


package lambda;

interface Addable{  
    int add(int a,int b);  
}  

public class LambdaExpressionExample4 {

	public static void main(String[] args) {


		Addable ad1 = (a,b)->a+b;
		
		System.out.println(ad1.add(10, 20));
		
		
		
		Addable ad2 = (a,b)-> {
			return a+b;
		};
		
		System.out.println(ad2.add(10, 20));

	}

}
