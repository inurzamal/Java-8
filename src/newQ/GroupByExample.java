package newQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import interviewQ_J8.Employee;

public class GroupByExample {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();

		emp.add(new Employee(1, "Rahul", "HR"));
		emp.add(new Employee(2, "Karan", "Dev"));
		emp.add(new Employee(3, "Ajay", "HR"));
		emp.add(new Employee(4, "Shakib", "DevOps"));
		
		Map<String,Long> map = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		System.out.println(map);

	}

}
