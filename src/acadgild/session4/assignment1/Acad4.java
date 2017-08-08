package acadgild.session4.assignment1;

public class Acad4 {

	public static void main(String[] args) {

		if (args.length < 2) {
			System.out.println("Usage: java Acad4 <starting number> <ending number>");
		}
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);

		System.out.println(" Odd numbers between " + start + " and " + end);
		for (int index = start; index < end; index++) {

			if (index % 2 != 0) {
				System.out.println(index);
			}
		}

		System.out.println(" Even numbers between " + start + " and " + end);
		for (int index = start; index < end; index++) {

			if (index % 2 == 0) {
				System.out.println(index);
			}

		}
	}
}
