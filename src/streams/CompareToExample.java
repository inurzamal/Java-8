package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompareToExample {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		
		arList.add(5);
		arList.add(15);
		arList.add(50);
		arList.add(25);
		arList.add(30);
		
//		Stream<Integer> filteredStream = arList.stream().filter(i-> i >= 20);
//		Stream<Integer> sortedStream = filteredStream.sorted((i1,i2)->i2.compareTo(i1)); //sorting in descending order
//		sortedStream.forEach(i->System.out.println(i));
//		
		System.out.println("Now in Single Line..");
		
		Stream<Integer> sortedStream = arList.stream().filter(i-> i >= 20).sorted((i1,i2)->i2.compareTo(i1));
		sortedStream.forEach(i->System.out.println(i));
		
		System.out.println("Collecting to a List");
		
		List<Integer> sortedList = arList.stream().filter(i-> i >= 20).sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		sortedList.forEach(i->System.out.println(i));
		
		
	}

}
