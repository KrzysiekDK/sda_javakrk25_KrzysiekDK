package pl.sda.javakrk25.practising.ex_11;

import pl.sda.javakrk25.practising.ArrayUtil;

public class Ex_11_array_distinct {

    /**
     * napisać metodę, która zwraca elementy tablicy bez powtórzeń
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 5, 6, 7, 8, 1, 2, 3};

        for (int i : getDistinct(ints)) {
            System.out.print(i);
        }
    }

    private static int[] getDistinct(int[] ints) {
        int[] result = new int[0];
        for (int i : ints) {
            if (!ArrayUtil.contains(result, i)) {
                result = ArrayUtil.addToEnd(result, i);
            }
        }
        return result;
    }


}
