package interviewQ_J8;

import java.util.ArrayList;
import java.util.List;

public class FilterStartWith {

	public static void main(String[] args) {

		List<Employee> names = new ArrayList<>();
		
		names.add(new Employee(1, "Rahul", 30, "Male", "IT"));
		names.add(new Employee(2, "Sumi", 26, "Female", "IT"));
		names.add(new Employee(3, "Akira", 32, "Female", "Civil"));
		
		names.stream().filter(n->n.getName().startsWith("A")).forEach(i->System.out.println(i.getName()));
		
//		List<Employee> list = names.stream().filter(n->n.getName().startsWith("A")).collect(Collectors.toList());
//		list.forEach(i->System.out.println(i.getName()));
	}
}
