package minMax;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class MinMaxExample {

	public static void main(String[] args) {
		
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); //get this data from database	
		IntSummaryStatistics statistics = primes.stream().mapToInt(x->x).summaryStatistics();	
		System.out.println(statistics);
		
//		int statistics = primes.stream().mapToInt(x->x).summaryStatistics().getMax();	
//		System.out.println(statistics);
	}

}
