package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Create an ArrayList which will be able to store only Strings.
 * Create a printAll method which will print all the elements using an Iterator.
 */

public class Program3 {
	public static List<String> arrList;
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		arrList = new ArrayList<>();
		
		boolean yes = true;
		
		//while loop to add strings into the arraylist
		while(yes) {
			System.out.print("Enter String into Array List: ");
			arrList.add(sc.next());
			System.out.print("type 'Yes' if you want to add more Strings:");
			yes = sc.next().toLowerCase().equals("yes") ? true:false;
		}

		System.out.println("Strings in Arraylist are: \n");
		printAll();
		
	}
	
	//method that uses iterator to print items in arraylist
	public static void printAll() {
		Iterator<String> itr = arrList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
