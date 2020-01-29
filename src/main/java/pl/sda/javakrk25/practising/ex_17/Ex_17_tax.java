package pl.sda.javakrk25.practising.ex_17;

public class Ex_17_tax {

    /**
     * Napisać metodę, która obliczy należny podatek dla osób fizycznych.
     * Podatek liczymy na podstawie zasad:
     * do 26 roku życia 0% do I progu
     * dochód do 85528 (I próg) - podatek wynosi 17 %
     * dochod powyżej 85528 - podatek wynosi 17% z 85528 + 32% z nadwyżki
     *
     * @param args
     */
    public static int MAX_VALUE = 85528;
    public static double TAX_RATE_ONE = 0.17;
    public static double TAX_RATE_TWO = 0.32;
    public static int AGE = 26;
    public static double TAX_FREE_AMOUNT = 3093;

    public static void main(String[] args) {
        printTaxForAgeAndIncome(60000, 32);
        printTaxForAgeAndIncome(60000, 21);
        printTaxForAgeAndIncome(100000, 21);
        printTaxForAgeAndIncome(100000, 32);
    }

    public static void printTaxForAgeAndIncome(double income, int age) {
        double tax = getTax(income, age);
        System.out.println(String.format("For person %d years old, earning %.2f annually, tax to pay is %.2f", age, income, tax));
    }

    public static double getTax(double income, int age) {
        double incomeReduced = income - TAX_FREE_AMOUNT;
        double tierOneTax = getTaxOneTier(incomeReduced, age);
        double tierTwoTax = getTaxTwoTier(incomeReduced);
        return tierOneTax + tierTwoTax;
    }


    public static double getTaxTwoTier(double income) {
        double overIncome = income - MAX_VALUE;
        overIncome = Math.max(0, overIncome);
        return TAX_RATE_TWO * overIncome;
    }

    public static double getTaxOneTier(double income, int age) {
        double x = Math.min(MAX_VALUE, income);
        if (age > AGE) {
            return x * TAX_RATE_ONE;
        } else {
            return 0;
        }
    }


}
