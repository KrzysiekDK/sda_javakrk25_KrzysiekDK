package pl.sda.javakrk25.practising.ex_18;

import java.util.Scanner;

public class Ex_18 {

    /**
     * Pobrać od użytkownika liczbę naturalną, dodatnią (walidacja)
     * Wypisać wszystkie liczby nieparzyste dodatnie, mniejsze od podanej liczby
     *
     * @param args
     */
    public static void main(String[] args) {
        int x = getNumber();
        int n = 1;

//      while (n<x){
//          System.out.println(n);
//          n += 2;
//      }
        for (int i = 1; i < x; i += 2) {
            System.out.println(i);
        }
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        do {
            System.out.println("Provide number");
            n = scanner.nextInt();
        } while (n < 1);

        return n;
    }
}
