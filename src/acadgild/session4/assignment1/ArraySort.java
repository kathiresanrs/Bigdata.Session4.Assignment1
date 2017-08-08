package acadgild.session4.assignment1;

import java.util.Scanner;

/**
 * Sorted using bubble sort. Better approach would be to use
 * 
 * Arrays.sort( array, Collections.reverseOrder()); where array should be
 * defined as array of Integers
 * 
 * @author acadgild
 *
 */
public class ArraySort {
	public static void main(String[] args) {

		int number, temp;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter size of the Array : ");

		number = scanner.nextInt();

		int array[] = new int[number];

		System.out.println("Enter the array elements ");

		for (int index = 0; index < number; index++) {

			array[index] = scanner.nextInt();

		}

		for (int idx = 0; idx < number; idx++) {

			for (int idx2 = idx + 1; idx2 < number; idx2++) {

				if (array[idx] < array[idx2]) {

					temp = array[idx];
					array[idx] = array[idx2];
					array[idx2] = temp;
				}
			}
		}

		System.out.println("Sorted Array in Descending Order");

		for (int idx = 0; idx < number - 1; idx++) {

			System.out.print(array[idx] + ",");
		}

		System.out.print(array[number - 1]);
		scanner.close();
	}

}