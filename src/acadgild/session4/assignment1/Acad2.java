package acadgild.session4.assignment1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Acad2 {

	public static void main(String[] args) {

		int number1, number2;
		try {
			System.out.println("Enter the value for number1 : ");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader bufferedReader = new BufferedReader(isr);
			number1 = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter the value for number2 : ");
			number2 = Integer.parseInt(bufferedReader.readLine());

		} catch (Exception ex) {
			number1 = 0;
			number2 = 0;
		}
		System.out.println("Sum of number1 and number2 is " + (number1 + number2));
	}
}
