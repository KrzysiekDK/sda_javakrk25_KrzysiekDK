package pl.sda.javakrk25.practising.ex_18;

import pl.sda.javakrk25.practising.ScannerUtil;

public class Ex_18 {

    /**
     * Pobrać od użytkownika liczbę naturalną, dodatnią (walidacja)
     * Wypisać wszystkie liczby nieparzyste dodatnie, mniejsze od podanej liczby
     *
     * @param args
     */
    public static void main(String[] args) {
        int x = ScannerUtil.getNaturalNumber();
        int n = 1;

//      while (n<x){
//          System.out.println(n);
//          n += 2;
//      }
        for (int i = 1; i < x; i += 2) {
            System.out.println(i);
        }
    }


}
