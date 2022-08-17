package interviewQ_J8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import streams.Employee;

public class FindThirdHighestSalary {
	
	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(101, 500, "Raju"));
		emp.add(new Employee(102, 400, "Raju"));
		emp.add(new Employee(103, 700, "Raju"));
		emp.add(new Employee(104, 300, "Raju"));
		emp.add(new Employee(105, 900, "Raju"));
		
		List<Employee> sortedList = emp.stream().sorted((o1,o2)-> (int) (o1.getSalary()-o2.getSalary()))
				.collect(Collectors.toList());
		
		Float third = sortedList.stream().map(e->e.getSalary()).collect(Collectors.toList()).get(sortedList.size()-3);
		System.out.println(third);
		
	}
}
