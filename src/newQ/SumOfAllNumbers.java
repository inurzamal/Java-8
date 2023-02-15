package newQ;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbers {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 10);
		
//		Integer sum = integers.stream().reduce(0, (a, b) -> a + b);
		
		Integer sum = integers.stream().reduce(0, Integer::sum);
		
		System.out.println(sum);

	}

}
