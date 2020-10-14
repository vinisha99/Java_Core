package collections;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*Write a program that will have a Vector which is capable of storing emp objects.
 * Use an Iterator and enumeration to list all the elements of the Vector.
 */
public class Program8 {
	
	public static void main(String[] args) {
		
		Vector<Employee> empVector = new Vector<>(5);
		Scanner sc = new Scanner(System.in);
		boolean yes = true;
		
		//while loop to add employees into the Vector
		while(yes) {
			//Using employee class from 2nd program
			Employee emp = new Employee();
			System.out.print("Enter Employee Details into Array List: ");
			System.out.print("Employee name ");
			emp.setEmpName(sc.next());
			System.out.print("Employee ID ");
			emp.setEmpID(sc.nextInt());
			System.out.print("Employee Gender ");
			emp.setEmpGender(sc.next().charAt(0));
			System.out.print("Employee Email Address ");
			emp.setEmpEmail(sc.next());
			System.out.print("Employee Salary ");
			emp.setEmpSalary(sc.nextFloat());
			System.out.print("type 'Yes' if you want to add more Employee's Details:");
			
			empVector.add(emp);
			yes = sc.next().toLowerCase().equals("yes") ? true:false;
		}
		
		System.out.println("Strings in Arraylist are: \n");
		printAll(empVector);
		
		System.out.println("Emplist data: " + empVector.size());

	}
	
	public static void printAll(Vector<Employee> empList) {
		Iterator<Employee> itr = empList.iterator();
		Employee empDetails;
		while(itr.hasNext()) {
			empDetails = itr.next();
			System.out.println("ID: " + empDetails.getEmpID()
					+ " Name: " + empDetails.getEmpName()
					+ " Gender: " + empDetails.getEmpGender()
					+ " Address: " + empDetails.getEmpEmail()
					+ " Salary: " + empDetails.getEmpSalary());
		}
	}

}
