package streams;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkip {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
		
		//list.stream().limit(3).forEach(i->System.out.println(i));
		
		list.stream().skip(5).forEach(i->System.out.println(i));
	}

}
