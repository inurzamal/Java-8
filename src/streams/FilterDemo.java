package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {


		List<Integer> arList = new ArrayList<Integer>();
		
		arList.add(5);
		arList.add(15);
		arList.add(50);
		arList.add(25);
		arList.add(30);
		
		Stream<Integer> even = arList.stream().filter(i->i%2==0);
		even.forEach(x->System.out.println(x));
		
//		arList.stream().filter(i->i%2==0).forEach(x->System.out.println(x));

	}

}
