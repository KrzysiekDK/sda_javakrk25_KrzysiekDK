package pl.sda.javakrk25.day5;

import java.util.Random;

public class Zad_14_histogram {

    /**
     * Stwórz program który generuje historgram z losowych liczb
     * test changes - master
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] histogram = new int[10];
        Random random = new Random();
        //other comment
        for (int i = 0; i < 1_000_000; i++) {
            int randomNumber = random.nextInt(10);
            histogram[randomNumber]++;
        }

        for (int i = 0; i < histogram.length; i++) {
            System.out.println(String.format("%d -> %d", i, histogram[i]));
        }

        //additional sth
    }
}
