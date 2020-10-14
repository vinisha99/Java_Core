package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
	
	private Employee employee;
	public EmployeeDB_1 edb1 =  new EmployeeDB_1();
	public EmployeeDB_2 edb2 =  new EmployeeDB_2();
	public static Program2 p2;
	public static void main(String[] args) {
		p2 = new Program2();
		Scanner sc = new Scanner(System.in);
		boolean yes = true;
		
		int ID; char gender; float salary;
		String name, email;
		
		
		//while loop to get employee data
		while(yes) {
			System.out.print("Enter Employee Details: ");
			System.out.print("Employee ID ");
			ID = sc.nextInt();
			System.out.print("Employee name ");
			name = sc.next();
			System.out.print("Employee Email Address ");
			email = sc.next();
			System.out.print("Employee Gender ");
			gender = sc.next().charAt(0);
			System.out.print("Employee Salary ");
			salary = sc.nextFloat();
			p2.employee = new Employee(ID, name, email, gender, salary);
			
			//adding employee detail to arrayList
			if(p2.edb1.addEmployee(p2.employee))
				System.out.println("Employee Added to arrayList");
			
			//adding employee detail to treemap
			if(p2.edb2.addEmployee(p2.employee))
				System.out.println("Employee Added to TreeMap");
			
			System.out.print("type 'Yes' if you want to add more Employee's Details:");
			yes = sc.next().toLowerCase().equals("yes") ? true:false;
		}
		
		System.out.println("ArrayList Implementaion");
		p2.employeeDB_arrayListImplementation();
		
		System.out.println("TreeMap Implementaion");
		p2.employeeDB_treeMapImplementation();

	}
	
	public void employeeDB_arrayListImplementation() {
		try {
			p2.edb1.showPaySlip(10);
			p2.edb1.deleteEmployee(2);
			p2.displayEmployeeDB(p2.edb1.listAll());
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public void employeeDB_treeMapImplementation() {
		try {
			p2.edb2.showPaySlip(70);
			p2.edb2.deleteEmployee(13);
			p2.displayEmployeeDB(p2.edb2.listAll());
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public void displayEmployeeDB(Employee[] employee) {
		for(int i = 0; i < employee.length; i++) {
			System.out.println("Employee Details: \n"
					+ "ID " + employee[i].getEmpID()
					+ "Name " + employee[i].getEmpID()
					+ "Email" + employee[i].getEmpEmail()
					+ "Gender" + employee[i].getEmpGender()
					+ "Salary" + employee[i].getEmpSalary());
		}
	}

}
