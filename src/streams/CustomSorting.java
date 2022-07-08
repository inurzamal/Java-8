package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSorting {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, 500, "Raju"));
		empList.add(new Employee(2, 300, "Shayam"));
		empList.add(new Employee(3, 900, "Kabir"));
		
		List<Employee> list = empList.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary()))
				.limit(2)
				.collect(Collectors.toList());
		
		list.forEach(i->System.out.println(i));
	}
}
