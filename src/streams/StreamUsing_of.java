package streams;

import java.util.stream.Stream;

public class StreamUsing_of {

	public static void main(String[] args) {
		
		// using of() method we can create Stream, List, etc.
		
		System.out.println("Creating Stream using Of() method");
		
		Stream.of(4,50,30,25).filter(i->i>=30).sorted().forEach(i->System.out.println(i));
		
		//
		System.out.println("Another Example");
		
		String[] names = {"Rahul", "Karan", "Raj"};
		Stream.of(names).filter(i->i.length()>=5).forEach(i->System.out.println(i));

	}

}
