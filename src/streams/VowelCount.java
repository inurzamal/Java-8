package streams;

public class VowelCount {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		long count = s.chars().filter(c-> c=='a'||c=='e'||c=='i'||c=='o'||c=='u').count();
		System.out.println(count);
	
	}
}
