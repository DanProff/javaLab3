package ua.lviv.iot.transport.models;

public abstract class Transport {
    private LengthType length;
    private WeightType weight;
    private double price;

    public Transport(LengthType length, WeightType weight, double price) {
        this.length = length;
        this.weight = weight;
        this.price = price;
    }

    public LengthType getLength() {
        return length;
    }

    public void setLength(LengthType length) {
        this.length = length;
    }

    public WeightType getWeight() {
        return weight;
    }

    public void setWeight(WeightType weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


