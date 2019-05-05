package ua.lviv.iot.transport.models;

public class Cab extends Transport {
    private double maxSpeed;

    public Cab(LengthType length, WeightType weight, double price, double maxSpeed) {
        super(length, weight, price);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
