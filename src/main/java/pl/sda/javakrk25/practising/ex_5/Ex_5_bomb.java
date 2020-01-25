package pl.sda.javakrk25.practising.ex_5;

import java.util.Scanner;

public class Ex_5_bomb {

    /**
     * Napisać program, który odczytuje od użytkownika liczbę naturalną (zrobić walidację)
     * Następnie wyświetla co sekundę tekst: Bomba wybuchnie z n sekund, na koniec : BOOM
     * 3 rozwiązania, z użyciem 3 pętli: for, while, do-while
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        int secondsLeft = readUserInput();
        counter_do_while(secondsLeft);
    }

    private static int readUserInput() {
        System.out.println("Ile sekund? (podaj liczbę naturalneą)");
        Scanner s = new Scanner(System.in);
        int result = -1;
        do {
            int i = s.nextInt();
            if (i >= 0) {
                result = i;
            } else {
                System.out.println("Błąd, podaj jeszcze raz!");
            }
        } while (result == -1);
        return result;
    }

    private static void counter_for(int seconds) throws InterruptedException {
        for (int i = seconds; i >= 0; i--) {
            Thread.sleep(1000);
            System.out.println(String.format("Pozostało %d sekund", i));
        }
        System.out.println("BOOM!");
    }

    private static void counter_while(int seconds) throws InterruptedException {
        while (seconds >= 0) {
            Thread.sleep(1000);
            System.out.println(String.format("Pozostało %d sekund", seconds));
            seconds--;
        }
        System.out.println("BOOM!");
    }

    private static void counter_do_while(int seconds) throws InterruptedException {
        do {
            Thread.sleep(1000);
            System.out.println(String.format("Pozostało %d sekund", seconds));
            seconds--;
        } while (seconds >= 0);
        System.out.println("BOOM!");
    }
}
