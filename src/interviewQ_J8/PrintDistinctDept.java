package interviewQ_J8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintDistinctDept {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(1, "Rahul", 25, "Male", "IT"));
		emp.add(new Employee(2, "Karan", 33, "Male", "HR"));
		emp.add(new Employee(3, "Simran", 27, "Female", "IT"));
		emp.add(new Employee(4, "Rani", 30, "Female", "IT"));
		
//		List<String> uniqueDept = emp.stream().map(e->e.getDepartment()).distinct().collect(Collectors.toList());
//		System.out.println(uniqueDept);
		
		//print unique department
		emp.stream().map(Employee:: getDepartment).distinct().forEach(System.out::println);
		
		//group by department
		Map<String, Long> map = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(map);
		
		//Average age of male and female
		Map<String, Double> avgAge = emp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		System.out.println(avgAge);
	}
}
