package ua.lviv.iot.transport.models;

public class Rider extends Transport {
    private int wheelsAmount;

    public Rider() {
    }

    public Rider(final LengthType length, final WeightType weight,
                 final double price, final int wheelsAmount) {
        super(length, weight, price);
        this.wheelsAmount = wheelsAmount;
    }

    public final int getWheelsAmount() {
        return wheelsAmount;
    }

    public final void setWheelsAmount(final int wheelsAmount) {
        this.wheelsAmount = wheelsAmount;
    }

}
