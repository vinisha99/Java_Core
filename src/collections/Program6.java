package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*Implement the assignment 1 using Linked List
 */
public class Program6 {
	LinkedList<Integer> evenNums;
	LinkedList<Integer> numsMultiplied;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Program1 p1 = new Program1();
		System.out.println("Enter Number: ");
		try {
			int num = sc.nextInt();
			if(num <= 0)
				return;
			p1.saveEvenNumbers(num);
			
			System.out.println("Printing 1st LinkedList:");
			p1.printEvenNumbers();
			
			System.out.print("Enter a number to find in 1st LinkedList: ");
			int n = sc.nextInt();
			if(p1.printEvenNumber(n) == 0)
				System.out.println("Number not in 1st LinkedList");
			else
				System.out.println("Number Found in 1st LinkedList");
				
		}
		catch(Exception ex) {
			System.out.println("Exception Occurred: "+ ex.getMessage());
		}

	}
	
	//method to save even numbers
	public LinkedList<Integer> saveEvenNumbers(int num) {
		evenNums = new LinkedList<>();
		for(int i = 2; i <= num; i= i+2)
			evenNums.add(i);
		return evenNums;
	}
	
	//method to print even numbers and save them as 2*num format into new LinkedList
	public LinkedList<Integer> printEvenNumbers() {
		numsMultiplied = new LinkedList<>(); 
		
		for(int i=0; i < evenNums.size(); i++) {
			numsMultiplied.add(evenNums.get(i) * 2);
			System.out.println(numsMultiplied.get(i));
		}
		return numsMultiplied;
	}
	
	//method that will check & return if a given number is present in the 1st LinkedList 
	public int printEvenNumber(int num){
		if(num%2 != 0 || num < 2)
			return 0;
		if(evenNums.contains(num))
			return num;
		return 0;
	}

}
