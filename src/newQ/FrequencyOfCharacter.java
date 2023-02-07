package newQ;

//Count Frequency of character

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {

	public static void main(String[] args) {

		String str = "Hhellhooo";
		
		Map<String,Long> map = Arrays.stream(str.toLowerCase().split("")).collect(Collectors.groupingBy(c->c, Collectors.counting()));
		
//		LinkedHashMap<String, Long> map = Arrays.stream(str.toLowerCase().split("")).collect(Collectors.groupingBy(c->c,LinkedHashMap::new, Collectors.counting()));
		
		System.out.println(map);

	}

}
