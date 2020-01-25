package pl.sda.javakrk25.practising.ex_9;

public class Ex_9_string_contains_check {

    /**
     * Program, który sprawdza czy 1 tekst zawiera się w innym
     *
     * @param args
     */
    public static void main(String[] args) {
        String text = "Some loong text";
        String textToCheck = "ong t";

        char[] sentence = text.toLowerCase().toCharArray();
        char[] word = textToCheck.toLowerCase().toCharArray();


        if (contains(sentence, word)) {
            System.out.println("Contains");
        } else {
            System.out.println("Not contains");
        }
    }


    private static boolean contains(char[] sentence, char[] word) {
        int j = 0;
        int i = 0;
        while (i <= sentence.length) {
            if (sentence[i] == word[j]) {
                if (j == word.length - 1) {
                    return true;
                }
                j++;
            } else {
                i -= j;
                j = 0;
            }
            i++;
        }
        return false;
    }
}
