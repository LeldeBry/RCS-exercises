
import java.util.Scanner;

public class sortArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array [20-40] : ");
		int size = sc.nextInt();
		sc.close();

		int[] arr1 = new int[size];
		Util.fillArrayRandom(arr1, 99, 10);
		Util.printArr(arr1, "Array");
		Util.arraySortAsc(arr1);
		Util.printArr(arr1, "Ascending array");

	}

}
