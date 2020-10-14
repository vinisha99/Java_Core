package collections;

import java.util.Map;
import java.util.TreeMap;


//Implementation of Employee DB using TreeMap
public class EmployeeDB_2 {
	//Creating TreeMap that stores all employee details
	private Map<Integer, Employee> employeeMap;
	
	EmployeeDB_2(){
		employeeMap = new TreeMap<>();
	}
	
	/*Adds employee into TreeMap.
	 * return true if employee with unique empID is added
	 * returns false if employee with same empID is already present in the TreeMap
	 */
	public boolean addEmployee(Employee emp) {
		//Checking if Employee with same EmpID is already present
		if(employeeMap.containsKey(emp.getEmpID()))
			return false;
		
		//comparing with null, since put method returns null when a new key is inserted
		employeeMap.put(emp.getEmpID(), emp);
		return true;
	}

	/*Deletes a specific employee from TreeMap
	 * throws Employee not found exception if Employee data is not found in the TreeMap
	 */
	public boolean deleteEmployee(int empID) throws EmployeeNotFoundException {
		
		if(employeeMap.containsKey(empID)) {
			employeeMap.remove(empID);
			return true;
		}
		throw new EmployeeNotFoundException();
	}
	
	/*Displays specific employee's PaySlip from TreeMap
	 * throws Employee not found exception if Employee data is not found in the TreeMap
	 */
	public String showPaySlip(int empID) throws EmployeeNotFoundException {
		if(employeeMap.containsKey(empID)) {
			Employee employee = employeeMap.get(empID);
			return ("Employee Name: " + employee.getEmpName() + "Employee Salary: " + employee.getEmpSalary());
		}
		throw new EmployeeNotFoundException();
	}
	
	//Returns all employee object values from TreeMap as an Array 
	public Employee[] listAll() {
		return employeeMap.values().toArray(new Employee[0]);
	}

}
