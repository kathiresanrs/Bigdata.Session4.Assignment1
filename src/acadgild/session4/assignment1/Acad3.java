package acadgild.session4.assignment1;

public class Acad3 {
	public static void main(String[] args) {
		int number1 = 100;
		int number2 = 200;
		System.out.println("First number is : " + number1);
		System.out.println("Second number is : " + number2);
		System.out.println("sum is : " + sum(number1, number2));
	}

	private static int sum(int number1, int number2) {
		return number1 + number2;
	}
}
