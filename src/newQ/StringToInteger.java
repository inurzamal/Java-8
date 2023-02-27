package newQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToInteger {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("1", "2", "5");
		
		List<Integer> numList = new ArrayList<>();
		
		for(String s: list) {
			numList.add(Integer.valueOf(s));
		}
		
		numList.forEach(System.out::print);
	}
}
