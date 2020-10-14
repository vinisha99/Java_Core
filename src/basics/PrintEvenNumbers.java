package basics;

/*Write a program to print even numbers between 23 and 57,
 * each number should be printed in a separate row.
 */
public class PrintEvenNumbers {

	public static void main(String[] args) {
		for(int i = 24; i < 57; i++) {
			if(i%2 == 0) //Checks and prints if number is even
				System.out.println(i);
		}
	}

}
