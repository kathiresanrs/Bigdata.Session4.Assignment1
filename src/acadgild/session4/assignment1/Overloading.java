package acadgild.session4.assignment1;

public class Overloading {

	public static void main(String[] args) {

		int number1 = 100;
		int number2 = 200;

		double dbl1 = 10.5;
		double dbl2 = 20.5;

		System.out.println("Sum of integers number1 and number2 is " + sum(number1, number2));

		System.out.println("Sum of Double dbl1 and dbl2  is " + sum(dbl1, dbl2));

	}

	private static int sum(int number1, int number2) {
		return number1 + number2;
	}

	private static double sum(double number1, double number2) {
		return number1 + number2;
	}
}
