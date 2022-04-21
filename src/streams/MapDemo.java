package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {
	
	public static void main(String[] args) {
		
		List<Integer> arList = new ArrayList<Integer>();
		
		arList.add(5);
		arList.add(15);
		arList.add(50);
		arList.add(25);
		arList.add(30);
		
		Stream<Integer> map = arList.stream().map(i->i*i);
		
		map.forEach(x->System.out.println(x));
		
	}

}
