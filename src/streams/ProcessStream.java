package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessStream {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		
		arList.add(5);
		arList.add(15);
		arList.add(50);
		arList.add(25);
		arList.add(30);
		
//		Stream<Integer> sorted = arList.stream().sorted();
//		List<Integer> collect = sorted.collect(Collectors.toList()); //collected as list not stream
		
		List<Integer> filteredList = arList.stream().filter(i->i>20).collect(Collectors.toList());
		filteredList.forEach(i->System.out.println(i));
		
		
		//Processing stream using count() method instead of collect()
		
		System.out.println("Counting..");
		
		long count = arList.stream().filter(i->i>20).count();
		System.out.println(count);
		
	}

}
