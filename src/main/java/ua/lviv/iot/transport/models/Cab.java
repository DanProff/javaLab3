package ua.lviv.iot.transport.models;

public class Cab extends Transport {
    private double maxSpeed;

    public Cab() {
    }

    public Cab(final LengthType length, final WeightType weight,
               final double price, final double maxSpeed) {
        super(length, weight, price);
        this.maxSpeed = maxSpeed;
    }

    public final double getMaxSpeed() {
        return maxSpeed;
    }

    public final void setMaxSpeed(final double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
