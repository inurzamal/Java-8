package interviewQ_J8;

public class Employee {

	private int id;
	private String name;
	private String gender;
	private String department;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String gender, String department) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
