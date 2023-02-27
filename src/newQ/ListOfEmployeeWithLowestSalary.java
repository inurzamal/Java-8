package newQ;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import streams.Employee;

public class ListOfEmployeeWithLowestSalary {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1, 400, "Raju"));
		employees.add(new Employee(2, 500, "Simran"));
		employees.add(new Employee(3, 900, "Karan"));
		employees.add(new Employee(4, 300, "Kunal"));
		
//		List<Employee> min = employees.stream()
//				.collect(Collectors.groupingBy(Employee::getSalary, TreeMap::new, Collectors.toList()))
//				.firstEntry()
//				.getValue();		
//		System.out.println(min);
		
		Float lowestSalary = employees.stream()
				.min(Comparator.comparing(Employee::getSalary))
				.map(Employee::getSalary).get();
		System.out.println(lowestSalary);
	}
}

