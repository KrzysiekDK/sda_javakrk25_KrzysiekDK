package pl.sda.javakrk25.practising.ex_13;

public class Car extends Vehicle {
    private static final int MAX_SPEED = 120;

    int engineVolume;

    public Car(int speed, int engineVolume) {
        super(speed, MAX_SPEED);
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return super.toString() + String.format(" To także jest samochód, pojemność silnika: %d", engineVolume);
    }
}
