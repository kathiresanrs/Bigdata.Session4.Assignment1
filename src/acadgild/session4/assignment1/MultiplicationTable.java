package acadgild.session4.assignment1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number for which the table to be printed : ");
		int number = scanner.nextInt();

		System.out.println("Multiplication table for " + number + " is ");
		for (int index = 1; index <= 10; index++) {

			System.out.println(number + " * " + index + " = " + (index * number));
		}
		scanner.close();
	}
}
