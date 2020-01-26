package pl.sda.javakrk25.practising;

import java.util.Arrays;

public class ArrayUtil {
    public static int[] addToEnd(int[] tab, int element) {
        int[] array = Arrays.copyOf(tab, tab.length + 1);
        array[array.length - 1] = element;
        return array;
    }

    public static boolean contains(int[] tab, int element) {
        for (int i : tab) {
            if (i == element) return true;
        }
        return false;
    }
}
