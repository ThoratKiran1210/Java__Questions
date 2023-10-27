package Assignment;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.next();

        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal equivalent: " + decimal);

        scanner.close();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int binaryLength = binary.length();

        for (int i = 0; i < binaryLength; i++) {
            char digit = binary.charAt(i);
            int power = binaryLength - 1 - i;

            if (digit == '1') {
                decimal += Math.pow(2, power);
            }
        }

        return decimal;
    }
}
