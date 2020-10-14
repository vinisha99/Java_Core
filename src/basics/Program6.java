package basics;

import java.util.Scanner;

/*Write a program to accept gender ("Male" or "Female") and age (1-120)
 * from command line arguments and print the percentage of interest based on the given conditions.
 * Interest == 8.2% Gender ==> Female Age ==>1 to 58
 * Interest == 7.6% Gender ==> Female Age ==>59 -120
 * Interest == 9.2% Gender ==> Male Age ==>1-60
 * Interest == 8.3% Gender ==> Male Age ==>61-120
 */

public class Program6 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try {
			//Reads and validates gender value 
			System.out.print("Enter M/m for male \nEnter F/f for female");
			char gender = sc.next().toLowerCase().charAt(0);
			if(!(gender == 'f' || gender == 'm'))
				throw new GenderNotValidException();
			
			//Reads and validates age value 
			System.out.print("\nEnter Age: ");
			int age = sc.nextInt();
			if(age < 1 || age > 120)
				throw new AgeNotValidException();
			
			//instantiating Constants class
			Constants constant = new Constants();
			
			//Prints interest rate for female
			if(gender == 'f') { 
				if( age <= 58)
					System.out.println("Interest Rate is: " + constant.f58);
				else
					System.out.println("Interest Rate is: " + constant.f120);
			}
			else { //Prints interest rate for male
				if( age <= 60)
					System.out.println("Interest Rate is: " + constant.m60);
				else
					System.out.println("Interest Rate is: " + constant.m120);
			}
				
		}catch (AgeNotValidException ex) {//Catching invalid age exception
			System.out.print("Exception Occurred!! Try Again ");
		} catch (GenderNotValidException ex) { //Catching invalid gender exception
			System.out.print("Exception Occurred!! Try Again");
		}
		catch(Exception ex) {
			System.out.print("Exception Occurred: " + ex.getMessage());
		} 

	}

}
class Constants{
	final String f58 = "8.2%"; //interest rate for female age 1-58
	final String f120 = "7.6%"; //interest rate for female age 59-120
	final String m60 = "9.2%"; //interest rate for male age 1-60
	final String m120 = "8.3%"; //interest rate for male age 61-120
}

//Creating custom invalid age exception
class AgeNotValidException extends Throwable{
	AgeNotValidException(){
		System.out.println("\nAge should be between 1-120");
	}
}

//Creating custom invalid age exception
class GenderNotValidException extends Throwable{
	GenderNotValidException(){
		System.out.println("\nGender should be either M/m for Male\nF/f for Female");	
	}
}
