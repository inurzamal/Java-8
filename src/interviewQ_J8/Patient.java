package interviewQ_J8;

public class Patient {

	private String name;
	private int age;
	private String diseases;
	private int billAmount;

	public Patient() {
	}

	public Patient(String name, int age, String diseases, int billAmount) {
		super();
		this.name = name;
		this.age = age;
		this.diseases = diseases;
		this.billAmount = billAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDiseases() {
		return diseases;
	}

	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

}
