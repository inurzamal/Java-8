package newQ;

//Highest salary in each Dept

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import interviewQ_J8.Employee;

public class HighestSalaryOfEachDept {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, "Rahul", "HR", 500));
		empList.add(new Employee(1, "Rahul", "HR", 600));
		empList.add(new Employee(1, "Rahul", "Dev", 1500));
		empList.add(new Employee(1, "Rahul", "Dev", 1200));
		
		Comparator<Employee> comp = Comparator.comparing(Employee::getSalary);
		
		Map<String,Optional<Employee>> map = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.reducing(BinaryOperator.maxBy(comp))));
		
		System.out.println(map);

	}

}
