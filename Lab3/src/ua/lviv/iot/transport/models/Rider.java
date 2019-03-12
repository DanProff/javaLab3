package ua.lviv.iot.transport.models;

public class Rider extends Transport {
    private int wheelsAmount;

    public Rider(LengthType length, WeightType weight, double price, int wheelsAmount) {
        super(length, weight, price);
        this.wheelsAmount = wheelsAmount;
    }

    public int getWheelsAmount() {
        return wheelsAmount;
    }

    public void setWheelsAmount(int wheelsAmount) {
        this.wheelsAmount = wheelsAmount;
    }
}
