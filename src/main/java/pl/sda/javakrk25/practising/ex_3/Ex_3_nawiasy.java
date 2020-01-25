package pl.sda.javakrk25.practising.ex_3;

import java.util.Scanner;

public class Ex_3_nawiasy {

    /**
     * Program który waliduje poprawność nawiasów w równaniu wpisanym przez użytkownika
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj równanie do walidacji nawiasów");
        String equasion = scanner.nextLine();

        int counter = 0;
        for (char c : equasion.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[': {
                    counter++;
                    break;
                }
                case ')':
                case '}':
                case ']': {
                    counter--;
                    break;
                }
            }
        }

        if (counter < 0) {
            System.out.println("Wyrażenie niepoprawne, za dużo nawiasów domykających");
        } else if (counter > 0) {
            System.out.println("Wyrażenie niepoprawne, za dużo nawiasów otwierających");
        } else {
            System.out.println("Wyrażenie poprawne");
        }
    }
}
