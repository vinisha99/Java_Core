package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Implementation of Employee DB using ArrayList
public class EmployeeDB_1 {
	//Creating an ArrayList that stores all employee details
	private List<Employee> employeeList;
	
	EmployeeDB_1(){
		employeeList = new ArrayList<>();
	}
	
	/*Adds employee into ArrayList.
	 * return true if employee with unique empID is added
	 * returns false if employee with same empID is already present in the arrayList
	 */
	public boolean addEmployee(Employee emp) {
		Iterator<Employee> empIterator = employeeList.iterator();
		Employee employee;
		
		//Checking if Employee with same EmpID is already present
		while(empIterator.hasNext()) {
			employee = empIterator.next();
			if(employee.getEmpID() == emp.getEmpID())
				return false;
		}
		return employeeList.add(emp);
	}

	/*Deletes a specific employee from ArrayList
	 * throws Employee not found exception if Employee data is not found in the arrayList
	 */
	public boolean deleteEmployee(int empID) throws EmployeeNotFoundException {
		Iterator<Employee> empIterator = employeeList.iterator();
		Employee employee;
		while(empIterator.hasNext()) {
			employee = empIterator.next();
			if(employee.getEmpID() == empID) {
				employeeList.remove(employee);
				return true;
			}
		}
		throw new EmployeeNotFoundException();
	}
	
	/*Displays specific employee's PaySlip from ArrayList
	 * throws Employee not found exception if Employee data is not found in the arrayList
	 */
	public String showPaySlip(int empID) throws EmployeeNotFoundException {
		Iterator<Employee> empIterator = employeeList.iterator();
		Employee employee;
		while(empIterator.hasNext()) {
			employee = empIterator.next();
			if(employee.getEmpID() == empID) {
				return ("Employee Name: " + employee.getEmpName() + "Employee Salary: " + employee.getEmpSalary());
			}
		}
		throw new EmployeeNotFoundException();
	}
	
	//Returns all employee objects from arrayList as an Array 
	public Employee[] listAll() {
		Collections.sort(employeeList);
		return (Employee[]) employeeList.toArray();
	}

}

//Custom Exception for Employee's whose record is not present in Employee ArrayList
class EmployeeNotFoundException extends Exception{
	EmployeeNotFoundException() {
		System.out.println("Employee Record not found!!");
	}
}
