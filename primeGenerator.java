
import java.util.Scanner;

public class primeGenerator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;

		do {
			System.out.print("Enter how many consecutive prime numbers you want to generate: ");
			n = sc.nextInt();
		} while (n < 1 || n > 25);

		sc.close();

		int[] arr = new int[n];

		fillArrayPrimes(arr, 100);

		Util.printArr(arr, "Prime numbers");

	}

	public static void fillArrayPrimes(int[] arr1, int upTo) {

		// create boolean array for 100 numbers
		// first 2 already false as they are not primes
		boolean[] prime = new boolean[upTo];
		for (int i = 2; i < prime.length; i++) {
			prime[i] = true;
		}

		// the sieve of Eratosthenes - iterates through given array
		// marking all multiples of numbers starting with 2, 3 etc, as false
		// the numbers left with boolean true are primes
		for (int i = 2; i * i < prime.length; i++) {
			for (int j = i; i * j < prime.length; j++) {
				if (prime[i * j]) {
					prime[i * j] = false;
				}
			}

		}
		// only the assigned number of primes are put in the given array
		int primeNmb = 0;
		for (int j = 0; j < arr1.length; j++) {
			for (int i = primeNmb + 1; i < prime.length; i++) {
				if (prime[i]) {
					primeNmb = i;
					arr1[j] = primeNmb;
					break;
				}

			}

		}

	}

}
