package interviewQ_J8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintDistinctDept {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(1, "Rahul", "Male", "IT"));
		emp.add(new Employee(1, "Karan", "Male", "HR"));
		emp.add(new Employee(1, "Simran", "Female", "IT"));
		emp.add(new Employee(1, "Rani", "Female", "IT"));
		
//		List<String> uniqueDept = emp.stream().map(e->e.getDepartment()).distinct().collect(Collectors.toList());
//		System.out.println(uniqueDept);
		
		//print unique department
		emp.stream().map(Employee:: getDepartment).distinct().forEach(System.out::println);
		
		//group by department
		Map<String, Long> map = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(map);		
	}
}
