package newQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByEx {

	public static void main(String[] args) {
		
		String str = "this is Java stream api";
		String[] split = str.split(" ");
		
		List<String> list = new ArrayList<>();
		
		for(String s: split) {
			list.add(s);
		}
		
		Map<Integer,List<String>> map = list.stream().collect(Collectors.groupingBy(String:: length));
	
		System.out.println(map);

	}
}
