package interviewQ_J8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Find the duplicate elements in a given integers list in java using Stream function

public class FindDuplicatesElements {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,25,12,10,35,40,50,50, 70,55,55,55);
		
		Set<Integer> set = new HashSet<Integer>();
		
		//list.stream().filter(x->!set.add(x)).forEach(i->System.out.println(i));
		
		list.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(i->System.out.println(i));

	}

}
