package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {

	public static void main(String[] args) {


		List<Integer> arList = new ArrayList<Integer>();
		
		arList.add(5);
		arList.add(15);
		arList.add(50);
		arList.add(25);
		arList.add(30);
		
		Stream<Integer> sorted = arList.stream().sorted(); //processing stream using sorted()
		sorted.forEach(x->System.out.println(x));
		
		System.out.println("Filtering then sorting: ");
		
		Stream<Integer> filtersorted = arList.stream().filter(i->i>20).sorted(); 
//		List<Integer> list = filtersorted.collect(Collectors.toList()); //collecting as list 
		filtersorted.forEach(x->System.out.println(x));

	}

}
