package pl.sda.javakrk25.practising.ex_2;

public class Ex_2_print_out_letteres {

    /**
     * wypisać wszystkie litery
     */
    public static void main(String[] args) {
        usingAsciiCodesRangeOnlyEnglishAlphabet();
        allAsciiLetters();
        allEnglishLetters();
    }


    private static void usingAsciiCodesRangeOnlyEnglishAlphabet() {
        for (char c = 97; c <= 122; c++) {
            System.out.print(Character.valueOf(c));
        }
        System.out.println();
    }

    private static void allEnglishLetters() {
        for (char c = 0; c <= 255; c++) {
            if (c >= 'a' && c <= 'z') {
                System.out.print(c);
            }
        }
    }

    private static void allAsciiLetters() {
        for (char c = 0; c <= 255; c++) {
            if (Character.isAlphabetic(c) && Character.isLowerCase(c)) {
                System.out.print(c);
            }
        }
        System.out.println();
    }


}
