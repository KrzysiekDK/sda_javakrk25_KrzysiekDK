package pl.sda.javakrk25.practising.ex_13;

public class Vehicle {
    int speed;
    int maxSpeed;

    public Vehicle(int speed, int maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return String.format("To jest pojazd, prędkość: %d, maksymalna prędkść %d", speed, maxSpeed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
