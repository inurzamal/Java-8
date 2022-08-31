package interviewQ_J8;

import java.util.Arrays;
import java.util.List;

public class SortInDescending {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3,2,1,5,6,7);
		list.stream().sorted((o1,o2)->o2.compareTo(o1)).forEach(i->System.out.print(i));

	}
}
