package basics;

/*Write a program to print prime numbers between 10 and 99.*/

public class Program13 {

	public static void main(String[] args) {
		System.out.print("Prime Numbers are: ");
		boolean flag = true; 
		for(int i=10; i <= 99; i++) {
			flag = true; //by default setting flag to true to assume that every number is prime
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					flag = false; //flag is set to false when number is not prime
					break;
				}
			}
			if(flag)
				System.out.print(i + "\t"); //prints the prime number
		}

	}

}
