package pl.sda.javakrk25.practising.ex_11;

import java.util.Arrays;

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
            if (!contains(result, i)) {
                result = addToEnd(result, i);
            }
        }
        return result;
    }

    private static int[] addToEnd(int[] tab, int element) {
        int[] array = Arrays.copyOf(tab, tab.length + 1);
        array[array.length - 1] = element;
        return array;
    }

    private static boolean contains(int[] tab, int element) {
        for (int i : tab) {
            if (i == element) return true;
        }
        return false;
    }

}
