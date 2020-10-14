package collections;

public class Employee implements Comparable<Employee>{
	private int empID;
	private String empName;
	private String empEmail;
	private char empGender;
	private float empSalary;

	//Employee parameterized Constructor
	public Employee(int empID, String empName, String empEmail, char empGender, float empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empGender = empGender;
		this.empSalary = empSalary;
	}
	
	//Employee Default constructor
	public Employee() {
		
	}


	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpEmail() {
		return empEmail;
	}


	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}


	public char getEmpGender() {
		return empGender;
	}


	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}


	public float getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	//prints employee details
	public void getEmployeeDetails() {
		
		System.out.println("Employee Details: \n"
				+ "Name: " + this.empName
				+ "Employee ID: " + this.empID
				+ "Employee Email: " + this.empEmail
				+ "Employee Gender: " + this.empGender
				+ "Employee Salary: " + this.empSalary);
	}

	/*Overriding compareTo method of Comparable interface, to sort employee objects with ascending
	 * order of EmpID
	 */
	@Override
	public int compareTo(Employee e) {
		if(this.empID > e.empID)
			return 1;
		return -1;
	}

}
