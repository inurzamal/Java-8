package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaComparator7 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1,"Laptop",95000f));
		list.add(new Product(2,"Desktop",45000f));
		list.add(new Product(3,"Mobile",35000f));
		list.add(new Product(4,"Tab",55000f));
		
		System.out.println("Sorting on the basis of name...");  
		
		
		// implementing lambda expression 
		Collections.sort(list, (p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		for(Product p: list) {
			System.out.println(p.name+" "+p.price);
		}
		
	}

}
