package ua.lviv.iot.transport.models;

public class AutoRiksha extends Transport {

    private double rating;

    public AutoRiksha(LengthType length, WeightType weight, double price, double rating) {
        super(length, weight, price);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
