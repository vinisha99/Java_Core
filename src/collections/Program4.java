package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Create an ArrayList which will be able to store only numbers.
 * Like int,float,double,etc, but not any other data type.
 */

public class Program4 {

	public static List<Double> arrList;
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		arrList = new ArrayList<>();
		
		boolean yes = true;
		
		//while loop to add Numbers into the arraylist
		while(yes) {
			System.out.print("Enter Numbers into Array List: ");
			arrList.add(sc.nextDouble());
			System.out.print("type 'Yes' if you want to add more Numbers:");
			yes = sc.next().toLowerCase().equals("yes") ? true:false;
		}

		System.out.println("Strings in Arraylist are: \n");
		printAll();
		
	}
	
	//method that uses iterator to print items in arraylist
	public static void printAll() {
		Iterator<Double> itr = arrList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
