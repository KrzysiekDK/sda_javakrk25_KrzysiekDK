package pl.sda.javakrk25.practising.ex_13;

public class Bicycle extends Vehicle {
    private static final int MAX_SPEED = 40;
    private int gears;

    public Bicycle(int speed, int gears) {
        super(speed, MAX_SPEED);
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String toString() {
        return super.toString() + String.format(" ten rower ma %d przerzutek", gears);
    }
}
