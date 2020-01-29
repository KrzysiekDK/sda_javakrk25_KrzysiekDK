package pl.sda.javakrk25.practising;

import java.util.Scanner;

public class ScannerUtil {

    public static int getNaturalNumber() {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        do {
            System.out.println("Provide number");
            n = scanner.nextInt();
        } while (n < 1);

        return n;
    }

    public static String readUserInput() {
        System.out.println("Hello, please provide text");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
