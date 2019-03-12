package ua.lviv.iot.transport.models;

public class Riksha extends Transport {
    private String color;

    public Riksha(LengthType length, WeightType weight, double price, String color) {
        super(length, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
