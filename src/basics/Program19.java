package basics;

/*Write a program to print first 5 values which are divisible by 2, 3, and 5.*/
public class Program19 {

	public static void main(String[] args) {
		int i = 0,//i keeps track of the first 5 numbers divisible by 2,3,5,
			num = 6;//Starting the number from 6
		while(i <5) {
			if(num % 2 == 0 && num%3 == 0 && num%5 == 0) {
				System.out.print(num + "\t");
				i++;
			}
			num++;
		}
	}
}
