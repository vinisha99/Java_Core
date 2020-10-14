package basics;
import java.util.Scanner;

/* Write a program to print the color name, based on color code.
 * If color code in not valid then print "Invalid Code".
 * R->Red, B->Blue, G->Green, O->Orange, Y->Yellow,W->White.
 */

public class ColorCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter color code: ");
			char code = sc.next().toLowerCase().charAt(0);
			
			switch(code) {
			case 'r': //Case for color code red
				System.out.println("Color code is Red");
				break;
			case 'o': //Case for color code orange
				System.out.println("Color code is Orange");
				break;
			case 'b': //Case for color code blue
				System.out.println("Color code is Blue");
				break;
			case 'g': //Case for color code green
				System.out.println("Color code is Green");
				break;
			case 'w': //Case for color code white
				System.out.println("Color code is White");
				break;
			default: //Invalid color code entered
				System.out.println("Color code is Invalid");
				break;
			}
		}
		catch(Exception ex) {
			System.out.println("Exception occureed: " + ex.getMessage());
		}
	}

}
