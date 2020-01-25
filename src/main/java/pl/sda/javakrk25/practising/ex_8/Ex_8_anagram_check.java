package pl.sda.javakrk25.practising.ex_8;

import java.util.Arrays;

public class Ex_8_anagram_check {


    /**
     * Sprawdzić czy podane słowa to anagram
     *
     * @param args
     */
    public static void main(String[] args) {
        String word1 = "Tokio";
        String word2 = "Kioto";

        if (isAnagram(word1, word2)) {
            System.out.println("Podane słowa to anagramy");
        } else {
            System.out.println("Podane słowa to nie są anagramy");
        }
    }

    private static boolean isAnagram(String w1, String w2) {
        char[] a1 = w1.toLowerCase().toCharArray();
        char[] a2 = w2.toLowerCase().toCharArray();

        if (a1.length != a2.length) { //ta sama długość liter
            return false;
        }
        if (a1.length == 0) { //ignorujemy puste słowa
            return false;
        }
        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean isAnagram = true;
        for (int i = 0; i < a1.length; i++) { //czy te same litery
            if (a1[i] != a2[i]) {
                isAnagram = false;
            }
        }

        return isAnagram;
        // alternative solution: return Arrays.compare(a1,a2) == 0;
    }
}
