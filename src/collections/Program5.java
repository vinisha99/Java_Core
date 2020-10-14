package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Create an ArrayList of Employee( id,name,address,sal) objects
 * and search for particular Employee object based on id number.
 */

public class Program5 {

	public static void main(String[] args) {
		List<EmployeeP5> empList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean yes = true;
		
		//while loop to add employees into the arraylist
		while(yes) {
			EmployeeP5 emp = new EmployeeP5();
			System.out.print("Enter Employee Details into Array List: ");
			System.out.print("Employee name ");
			emp.setEmpName(sc.next());
			System.out.print("Employee ID ");
			emp.setEmpID(sc.nextInt());
			System.out.print("Employee Address ");
			emp.setEmpAddress(sc.next());
			System.out.print("Employee Salary ");
			emp.setEmpSalary(sc.nextFloat());
			System.out.print("type 'Yes' if you want to add more Employee's Details:");
			
			empList.add(emp);
			yes = sc.next().toLowerCase().equals("yes") ? true:false;
		}
		
		System.out.println("Strings in Arraylist are: \n");
		printAll(empList);
		
		System.out.println("Emplist data: " + empList.size());
	}
	
	public static void printAll(List<EmployeeP5> empList) {
		Iterator<EmployeeP5> itr = empList.iterator();
		EmployeeP5 empDetails;
		while(itr.hasNext()) {
			empDetails = itr.next();
			System.out.println("ID: " + empDetails.getEmpID()
					+ " Name: " + empDetails.getEmpName()
					+ " Address: " + empDetails.getEmpAddress()
					+ " Salary: " + empDetails.getEmpSalary());
		}
	}

}

class EmployeeP5{
	private int empID;
	private String empName;
	private String empAddress;
	private float empSalary;
	
	
	/**
	 * @return the empID
	 */
	public int getEmpID() {
		return empID;
	}
	
	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	/**
	 * @return the empAddress
	 */
	public String getEmpAddress() {
		return empAddress;
	}
	
	/**
	 * @param empAddress the empAddress to set
	 */
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	/**
	 * @return the empSalary
	 */
	public float getEmpSalary() {
		return empSalary;
	}
	
	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
}
