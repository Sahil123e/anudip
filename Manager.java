package Member;

public class Manager extends Member{
	//additional data member of employee class
	String specialization;
	//default constructor
	public Manager(String specialization) {
		super();
		this.specialization = specialization;
	}

	public Manager(String name, int age, String contact, String address, String Salary) {
		super(name, age, contact, address, Salary);
		// TODO Auto-generated constructor stub
	}
	//method to display information of employee
	void displayempInfo() {
	System.out.println("name:"+name);
	System.out.println("age:"+age);
	System.out.println("contact:"+contact);
	System.out.println("address:"+address);
	System.out.println("Specialization:"+specialization);
	System.out.println("Salary:"+printSalary());
}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}