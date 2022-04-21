package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEachExample5 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Kiyaan");
		names.add("Hasibul");
		names.add("Rahat");
		
//		for(String s: names) {
//			System.out.println(s);
//		}
		
		names.forEach(
				n->System.out.println(n)
		);
	}

}
