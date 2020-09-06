import java.util.Scanner;

/* Uzrakstīt programmu, kura pārbauda vai parametrā saņemtā parole ir droša vai nē.
Droša parole sastāv no - vismaz 10 simboliem; tikai no burtiem un cipariem; satur vismaz 2 ciparus */

public class Uzdevums24 {

	public static void main(String[] args) {

		String password = inputPassword();

		passwordCheck(password);

	}

	public static String inputPassword() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a password: ");
		String pw = sc.next();

		sc.close();

		return pw;
	}

	public static void passwordCheck(String str) {

		int charCount = 0;
		int digitCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetterOrDigit(str.charAt(i))) {
				charCount++;
			}
			if (Character.isDigit(str.charAt(i))) {
				digitCount++;
			}
		}

		if (str.length() < 10) {
			System.err.println("Password is not safe - too short.");
			return;
		} else if (charCount != str.length()) {
			System.err.println("Password contains invalid character/s.");
			return;
		} else if (digitCount < 2) {
			System.err.println("Password is not safe - has too few numbers.");
			return;
		} else {
			System.out.println("Password is safe!");
		}
	}
}
