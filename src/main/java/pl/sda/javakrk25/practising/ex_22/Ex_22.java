package pl.sda.javakrk25.practising.ex_22;

import pl.sda.javakrk25.practising.ScannerUtil;

public class Ex_22 {

    /**
     * Program wczytuje od użytkownika dowolny tekst, następnie zlicza ilość wystąpień ostatniej LITERY
     *
     * @param args
     */
    public static void main(String[] args) {
        String input = ScannerUtil.readUserInput().trim().toLowerCase();
        char c = getLastLetter(input);
        int reps = countLetters(input, c);
        System.out.println(String.format("Amount of letter %c in text is %d", c, reps));


    }

    public static int countLetters(String input, char c) {
        char[] letters = input.toCharArray();
        int counter = 0;
        for (char a : letters) {
            if (c == a) {
                counter++;
            }
        }
        return counter;
    }

    public static char getLastLetter(String s) {
        char[] check = s.toCharArray();
        for (int i = check.length - 1; i > 0; i--) {
            if (Character.isLetter(check[i])) {
                return check[i];
            }
        }
        return ' ';
    }
}
