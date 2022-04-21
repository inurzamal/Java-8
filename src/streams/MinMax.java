package streams;

import java.util.ArrayList;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		
		arList.add(5);
		arList.add(15);
		arList.add(50);
		arList.add(25);
		arList.add(30);
		
		//Finding minimum or Max value without filtering
		
		Integer minValue = arList.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum Value: "+minValue);
		
		Integer maxValue = arList.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Max Value: "+ maxValue);
	
	}

}
