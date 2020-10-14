package basics;
import java.util.Scanner;

/*Write a program to add all the values in a given number and print.
 * Ex: 1234->10
 */
public class Program15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		try {
			int num = sc.nextInt();
			if(num/10 == 0) { //checks and returns the same number if it is single digit
				System.out.println(num);
				return;
			}
			int addition = 0;
			while(num != 0) { //using while loop to add units place digit in addition variable
				addition = addition + num%10;
				num = num/10;
			}
			System.out.println(addition);
			
		}
		catch(Exception ex) {
			System.out.println("Exception Occurred: "+ ex.getMessage());
		}
	}

}
