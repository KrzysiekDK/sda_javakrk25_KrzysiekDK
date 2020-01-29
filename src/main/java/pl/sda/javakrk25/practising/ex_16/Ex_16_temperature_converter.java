package pl.sda.javakrk25.practising.ex_16;

public class Ex_16_temperature_converter {

    /**
     * Napisać metody, które przeliczają temperaturę z Celciusza na Fahrenheita i odwrotnie
     *
     * @param args
     */
    public static void main(String[] args) {
        double cel = 39.5;
        double f = getFahrenheit(cel);
        double c = getCel(f);
        System.out.println(String.format("Temp is %.2f F", f));
        System.out.println(String.format("Temp is %.2f C", c));
    }

    public static double getFahrenheit(double cel) {
        double x = 1.8 * cel + 32;
        return x;
    }

    public static double getCel(double fahr) {
        double z = (fahr - 32) / 1.8;
        return z;
    }
}
