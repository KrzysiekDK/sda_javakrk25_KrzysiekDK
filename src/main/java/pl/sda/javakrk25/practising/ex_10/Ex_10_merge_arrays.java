package pl.sda.javakrk25.practising.ex_10;

public class Ex_10_merge_arrays {

    /**
     * Połączyć 2 tablice int[] w jedną
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] t1 = {11, 2, 3, 4};
        int[] t2 = {6, 7, 8, 9};
        int[] result = new int[t1.length + t2.length];

        //sposób 1 - iterujemy po tablicy wynikowej
//        for (int i = 0; i < result.length; i++) {
//            if (i < t1.length) {
//                result[i] = t1[i];
//            } else {
//                result[i] = t2[i - t1.length];
//            }
//        }

        //alternatywa - 2 pętle po mniejszych tablicach
        for (int i = 0; i < t1.length; i++) {
            result[i] = t1[i];
        }
        for (int i = 0; i < t2.length; i++) {
            result[i + t1.length] = t2[i];
        }


        for (int i : result) {
            System.out.print(i);
        }
    }
}
