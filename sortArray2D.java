import java.util.Random;
import java.util.Scanner;

public class sortArray2D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many arrays you want to make (10-20) : ");
		int n = sc.nextInt();
		sc.close();

		// initializing 2d array with given nmb of arrays
		int[][] mtx = new int[n][]; // 2d array with n rows
		
		// filling 2nd dimension with random nmbs
		for (int i = 0; i < n; i++) { 
			mtx[i] = new int[new Random().nextInt(50 - 10) + 10]; 
		}

		// filling each array with random numbers 100 - 999
		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx[i].length; j++) {
				mtx[i][j] = new Random().nextInt(999 - 100) + 100;
			}
		}

		// sorting elements in each array
		Util.array2DSortDsc(mtx);

		// creating array of average row values
		float[] avgValues = Util.array2DAvg(mtx);

		// sorting arrays of avg values and corresponding 2D array in ascending order
		int[] tmpArr = new int[mtx.length];
		float tmp = 0;
		for (int i = 0; i < avgValues.length; i++) {
			for (int j = i + 1; j < avgValues.length; j++) {
				if (avgValues[i] > avgValues[j]) {
					tmp = avgValues[i];
					avgValues[i] = avgValues[j];
					avgValues[j] = tmp;
					tmpArr = mtx[i];
					mtx[i] = mtx[j];
					mtx[j] = tmpArr;
				}
			}
		}
		Util.printArr(mtx[n - 1], "Array with highest average value");
	}

}
