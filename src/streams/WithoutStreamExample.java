//Without Stream

package streams;

import java.util.ArrayList;
import java.util.List;

public class WithoutStreamExample {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		
		arList.add(5);
		arList.add(15);
		arList.add(50);
		arList.add(25);
		arList.add(35);
		
		WithoutStreamExample s1 = new WithoutStreamExample();
		
		List<Integer> elements = s1.findElements(arList); //calling the method
		
		//elements.forEach(n->System.out.println(n)); //printing the elements
		for(Integer n: elements) {
			System.out.println(n);
		}

	}
	
	//creating method to return list of elements greater than something without Stream
	
	List<Integer> findElements(List<Integer> arlist){
		List<Integer> newArList = new ArrayList<Integer>();
		
		for(Integer i: arlist) {
			if(i>30) {newArList.add(i);}
		}
		return newArList;
		
	}

}
