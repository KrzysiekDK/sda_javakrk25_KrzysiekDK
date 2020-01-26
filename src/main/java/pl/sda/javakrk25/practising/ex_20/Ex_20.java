package pl.sda.javakrk25.practising.ex_20;

import pl.sda.javakrk25.practising.ScannerUtil;

public class Ex_20 {

    /**
     * Program wczytuje od użytkownika liczbę całkowitą n,
     * następnie wyświetla wszystkie potęgi liczby 2, nie większe niż podaba liczba
     *
     * @param args
     */
    public static void main(String[] args) {
        int z = ScannerUtil.getNaturalNumber();
        printPowers(z);
    }

    public static void printPowers(int a) {
        int x = 0;
        while (Math.pow(2, x) < a) {
            System.out.println(String.format("2 power x %d = %.0f", x, Math.pow(2, x)));
            x++;
        }

    }
}
