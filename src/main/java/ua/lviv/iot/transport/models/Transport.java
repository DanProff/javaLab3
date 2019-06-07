package ua.lviv.iot.transport.models;

public abstract class Transport {
    private LengthType length;
    private WeightType weight;
    private double price;

    public Transport(final LengthType length, final WeightType weight,
                     final double price) {
        this.length = length;
        this.weight = weight;
        this.price = price;
    }

    public Transport() {
    }

    public String getHeaders() {
        return "length, "
                + "weight, "
                + "price ,";
    }

    public String toCSV() {
        return length + ", "
                + weight + ", "
                + price;
    }

    public final LengthType getLength() {
        return length;
    }

    public final void setLength(final LengthType length) {
        this.length = length;
    }

    public final WeightType getWeight() {
        return weight;
    }

    public final void setWeight(final WeightType weight) {
        this.weight = weight;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }
}


