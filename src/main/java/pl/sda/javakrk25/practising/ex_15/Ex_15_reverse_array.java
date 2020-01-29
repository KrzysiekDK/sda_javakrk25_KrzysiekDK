package pl.sda.javakrk25.practising.ex_15;

public class Ex_15_reverse_array {

    /**
     * odwrócić tablicę intów
     * wypisać połowę elementów
     * wypisać połowę elementów: od środkowego do pierszego
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        getRewersedTableSWAP(input);
        printReversedHalfTable(input);
    }

    public static int[] getReversedTable(int[] arr1) {
        int[] result = new int[arr1.length];
        for (int i = arr1.length; i > 0; i--) {
            result[arr1.length - i] = arr1[i - 1];
        }
        return result;
    }

    public static void getRewersedTableSWAP(int[] arr2) {
        int a;
        for (int i = 0; i < arr2.length / 2; i++) {
            a = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = a;
        }
    }

    public static void getHalfTable(int[] arr) {
        int x = arr.length / 2;
        if (arr.length % 2 != 0) {
            x++;
        }
        for (int i = 0; i < x; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printReversedHalfTable(int[] arr) {
        int x = arr.length / 2;
        if (arr.length % 2 != 0) {
            x++;
        }
        for (int i = x; i > 0; i--) {
            System.out.println(arr[i - 1]);
        }
    }


}
