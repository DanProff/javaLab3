package ua.lviv.iot.transport.models;

public class Riksha extends Transport {
    private String color;

    public Riksha() {
    }

    public Riksha(final LengthType length, final WeightType weight,
                  final double price, final String color) {
        super(length, weight, price);
        this.color = color;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(final String color) {
        this.color = color;
    }
}
