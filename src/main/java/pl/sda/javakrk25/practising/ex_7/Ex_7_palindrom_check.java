package pl.sda.javakrk25.practising.ex_7;

public class Ex_7_palindrom_check {

    /**
     * Sprawdź czy podane słowo jest palindromem - czy czytane od końca brzmi tak samo
     *
     * @param args
     */
    public static void main(String[] args) {
        if (isPalindrom("kajak")) {
            System.out.println("Podane słowo to palindrom");
        } else {
            System.out.println("Podane słowo to nie jest palindrom");
        }
    }

    private static boolean isPalindrom(String text) {
        char[] letters = text.toLowerCase().toCharArray();
        boolean isPalindrom = true;
        for (int i = 0; i < letters.length / 2; i++) {
            if (letters[i] != letters[letters.length - i - 1]) {
                isPalindrom = false;
            }
        }
        return isPalindrom;
    }

}
