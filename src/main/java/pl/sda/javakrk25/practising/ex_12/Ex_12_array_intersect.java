package pl.sda.javakrk25.practising.ex_12;

import pl.sda.javakrk25.practising.ArrayUtil;

public class Ex_12_array_intersect {

    /**
     * Napisać metodę, która zwraca część wspólną z 2 tablic
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4, 5};
        int[] tab2 = {4, 5, 6, 7};
        int[] tab3 = {4};
        int[] tabFinal = getIntersect(tab1, tab2, tab3);
        for (int i : tabFinal) {
            System.out.println(i);
        }
    }


    private static int[] getIntersect(int[] tab1, int[] tab2, int[] tab3) {
        int[] result = new int[0];
        for (int i : tab1) {
            if (ArrayUtil.contains(tab2, i) && ArrayUtil.contains(tab3, i)) {
                result = ArrayUtil.addToEnd(result, i);
            }
        }
        return result;
    }

}
