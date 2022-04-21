package interviewQ_J8;

public class TestFuntionalInterface {

	public static void main(String[] args) {

		FunctionalInter p = (a,b) -> a * b;
		
		System.out.println(p.multiply(5, 10));
		
	}

}
