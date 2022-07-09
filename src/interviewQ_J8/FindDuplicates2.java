package interviewQ_J8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import streams.Employee;

public class FindDuplicates2 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, 500, "Rahul");
		Employee emp2 = new Employee(2, 800, "Karan");
		Employee emp3 = new Employee(3, 400, "Karan");
		
		List<Employee> list2 = List.of(emp1,emp2,emp3);		
		Map<String, Long> map2 = list2.stream().map(e->e.getName()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map2);
		
		List<String> list = Arrays.asList("Apple", "Apple", "Orange", "Mango");
		Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);

	}

}
