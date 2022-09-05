package interviewQ_J8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(101, "Rahul", 33, "Male", "IT"));
		list.add(new Employee(102, "Simran", 30, "Female", "HR"));
		list.add(new Employee(103, "Karan", 32, "Male", "IT"));
		
		Map<String,String> map = list.stream().collect(Collectors.toMap(Employee::getName, Employee::getDepartment));
		//System.out.println(map);
		map.entrySet().forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
	}
}
