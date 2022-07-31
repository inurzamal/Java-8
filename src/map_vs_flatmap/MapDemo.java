package map_vs_flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("pineapple");
        fruits.add("kiwi");
        
        System.out.println("List of fruit-" + fruits);
        
        List<Integer> list = fruits.stream().map(f->f.length()).collect(Collectors.toList());
		
        System.out.println("Length of each fruits: "+ list);

	}

}
