package decimalToBinary;

import java.util.Scanner;

/*
 * This is the program to convert a given Decimal no. which is in String format into Binary no. in
 *  String format 
 */
public class DecimalToBinary {

	public static String decimalToBinary(String decStr) {
		try {
			// Convert the decimal string to an integer
			int decimalNumber = Integer.parseInt(decStr);

			// Initialize a StringBuilder to store the binary string
			StringBuilder binStr = new StringBuilder();

			// Perform the binary conversion
			while (decimalNumber > 0) {
				int rem = decimalNumber % 2;
				binStr.insert(0, rem);
				decimalNumber /= 2;
			}

			// Handle the case when the input is "0"
			if (binStr.length() == 0) {
				return "0";
			}

			return binStr.toString();
		} catch (NumberFormatException nfe) {

			return "Invalid input. Please provide a valid decimal number.";
		} catch (Exception e) {

			return "Not a number.....";
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The NUmber you want to convert into Binary..!");
		String decStr = sc.next();

		String binaryString = decimalToBinary(decStr);
		System.out.println(binaryString);

	}

}
