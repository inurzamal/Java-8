package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		List<Integer> arList = new ArrayList<Integer>();
		
		arList.add(5);
		arList.add(15);
		arList.add(50);
		arList.add(25);
		arList.add(35);
		
		//List<Integer> newArList = new ArrayList<Integer>();
		
		List<Integer> collect = arList.stream().filter(x -> x >= 25).collect(Collectors.toList());
		
		collect.stream().forEach(i -> System.out.println(i));
	}

}
