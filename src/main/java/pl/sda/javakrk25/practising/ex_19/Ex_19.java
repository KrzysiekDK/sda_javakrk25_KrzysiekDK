package pl.sda.javakrk25.practising.ex_19;

import pl.sda.javakrk25.practising.ScannerUtil;

public class Ex_19 {

    /**
     * program który pobiera od użytkownika 2 liczby (A,B),
     * a następnie liczy sumę liczb pomiędzy A,A+1,...,B
     *
     * @param args
     */
    public static void main(String[] args) {
        int A = ScannerUtil.getNaturalNumber();
        int B = ScannerUtil.getNaturalNumber();
        System.out.println(sumInRange(A, B));
    }

    public static int sumInRange(int A, int B) {
        if (A > B) {
            return sumInValideRange(B, A);
        } else if (A < B) {
            return sumInValideRange(A, B);
        } else {
            return B;
        }
    }

    public static int sumInValideRange(int A, int B) {
        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumInValideRangeWhile(int A, int B) {
        int sum = 0;
        while (A <= B) {
            sum += A;
            A++;
        }
        return sum;
    }

    public static int sumInValideRangeDoWhile(int A, int B) {
        int sum = 0;
        do {
            sum += A;
            A++;
        } while (A <= B);
        return sum;
    }
}
