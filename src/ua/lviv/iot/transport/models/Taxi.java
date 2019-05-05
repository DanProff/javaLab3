package ua.lviv.iot.transport.models;

public class Taxi extends Transport {
    private double enginePower;
    private int capacity;

    public Taxi(LengthType length, WeightType weight, double price, double enginePower, int capacity) {
        super(length, weight, price);
        this.enginePower = enginePower;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
