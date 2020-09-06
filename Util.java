import java.util.Random;

public class Util {

	public static void printArr(int[] arr, String text) {

		String output = "";
		String sep = "";

		for (int elem : arr) {
			output += (sep + elem);
			sep = ", ";
		}
		System.out.println();
		System.out.println(text + ": \n" + output);
	}

	public static void fillArrayRandom(int[] arr, int max, int min) {

		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(max - min) + min;
		}
	}

	public static void arraySortAsc (int[] arr) {
		
		// sorting array elements in ascending order
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	public static void arraySortDsc (int[] arr) {
		
		// sorting array elements in ascending order
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}	

	public static void array2DSortDsc (int[][] arr) {
		
		// sorting the elements of each array in descending order
		for (int i = 0; i < arr.length; i++) {
			int tmp = 0;
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = j + 1; k < arr[i].length; k++) {
					if (arr[i][j] < arr[i][k]) {
						tmp = arr[i][j];
						arr[i][j] = arr[i][k];
						arr[i][k] = tmp;
					}
				}
			}
		}
	}
	
	public static void array2DSortAsc (int[][] arr) {
		
		// sorting the elements of each array in descending order
		for (int i = 0; i < arr.length; i++) {
			int tmp = 0;
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = j + 1; k < arr[i].length; k++) {
					if (arr[i][j] > arr[i][k]) {
						tmp = arr[i][j];
						arr[i][j] = arr[i][k];
						arr[i][k] = tmp;
					}
				}
			}
		}
	}

	public static float [] array2DAvg (int [][] arr) {
		
		float[] avgValue = new float[arr.length];
		float sum;

		for (int i = 0; i < arr.length; i++) { // one array
			sum = 0;

			for (int j = 0; j < arr[i].length; j++) { // one element value
				sum += arr[i][j];
			}
			avgValue[i] = sum / arr[i].length;
		}
		
		return avgValue;
	}

}
