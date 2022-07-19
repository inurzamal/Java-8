package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompareToExample {

	public static void main(String[] args) {
		
		List<Integer> arList = Arrays.asList(10,20,30,70,50);
					
		System.out.println("Sort in descending order..");
		
		Stream<Integer> sortedStream = arList.stream().sorted((i1,i2)->i2.compareTo(i1));
		sortedStream.forEach(i->System.out.println(i));
		
		System.out.println("Collecting to a List");
		
		List<Integer> sortedList = arList.stream().filter(i-> i >= 20).sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		sortedList.forEach(i->System.out.println(i));	
	}
}
