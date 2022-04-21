package lambda;

public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		
		int x = 10;

		Drawable d = ()->System.out.println("Drawing "+x);
		
		d.draw();

	}

}
