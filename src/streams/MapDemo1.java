package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("Mango");
		fruits.add("Orange");
		
		List<Integer> list = fruits.stream().map(i->i.length()).collect(Collectors.toList());
		
		System.out.println("Original List: "+fruits);
		System.out.println("After map() operation: "+list);

	}
}
