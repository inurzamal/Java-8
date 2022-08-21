package interviewQ_J8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import streams.Employee;

//increment salary by 12% whose salary is greater than 500.

public class MapAndFilterSalary {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, 600, "Raju"));
		emp.add(new Employee(2, 400, "Karan"));
		emp.add(new Employee(3, 700, "Biki"));
		emp.add(new Employee(4, 800, "Rahul"));
		
//		List<Float> salary = emp.stream().map(e->e.getSalary()).filter(s->s>500).collect(Collectors.toList());
//		
//		salary.stream().map(s->s*1.1).forEach(i->System.out.println(i));
		
		List<Employee> salary = emp.stream().filter(e->e.getSalary()>500).collect(Collectors.toList());
		salary.stream().map(e->e.getSalary()*1.2).forEach(s->System.out.println(s));
	}
}
