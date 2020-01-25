package pl.sda.javakrk25.practising.ex_6;

public class Ex_6_sum_digits {


    /**
     * Oblicz cumę CYFR w tekście, np
     * "Ala ma 27 lat a Jan 29" -> 20
     */
    public static void main(String[] args) {
        String text = "Ala ma 27 lat a Jan 29";
        int sum = 0;
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        System.out.println("Suma cyfr to:" + sum);
    }
}
