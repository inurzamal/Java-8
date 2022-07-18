package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaComparator7 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1,"Laptop",95000f));
		list.add(new Product(2,"Desktop",45000f));
		list.add(new Product(3,"Mobile",35000f));
		list.add(new Product(4,"Tab",55000f));
			
		
//		// implementing lambda expression 
//		Collections.sort(list, (p1,p2)->{
//			return p1.name.compareTo(p2.name);
//		});
		
		System.out.println("Sorting based on price..");
		
		List<Product> list2 = list.stream().sorted((o1,o2)->(int)(o1.getPrice()-o2.getPrice())).collect(Collectors.toList());
		list2.forEach(i->System.out.println(i.getName()+" " +i.getPrice()));
		
		System.out.println("Sorting based on name..");
		
		List<Product> list3 = list.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
		list3.forEach(i->System.out.println(i.getName()+" " +i.getPrice()));
		
//		for(Product p: list) {
//			System.out.println(p.name+" "+p.price);
//		}
		
	}

}
