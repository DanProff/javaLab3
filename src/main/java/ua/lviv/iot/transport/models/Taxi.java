package ua.lviv.iot.transport.models;

public class Taxi extends Transport {
    private double enginePower;
    private int capacity;

    public Taxi() {
    }

    public Taxi(final LengthType length, final WeightType weight,
                final double price, final double enginePower,
                final int capacity) {
        super(length, weight, price);
        this.enginePower = enginePower;
        this.capacity = capacity;

    }

    public String getHeaders() {
        return super.getHeaders()
                + "enginePower ,"
                + "capacity";
    }

    public String toCSV() {
        return super.toCSV()
                + enginePower + ", "
                + capacity;
    }

    public final double getEnginePower() {
        return enginePower;
    }

    public final void setEnginePower(final double enginePower) {
        this.enginePower = enginePower;
    }

    public final int getCapacity() {
        return capacity;
    }

    public final void setCapacity(final int capacity) {
        this.capacity = capacity;
    }
}
