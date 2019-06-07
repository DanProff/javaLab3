package ua.lviv.iot.transport.models;

public class AutoRiksha extends Transport {

    private double rating;
    private double horsePower;

    public AutoRiksha(
           final LengthType length, final WeightType weight,
           final double price, final double rating, final double horsePower) {
        super(length, weight, price);
        this.rating = rating;
        this.horsePower = horsePower;
    }

    public String getHeaders() {
        return super.getHeaders()
                + "rating, "
                + "horsePower, ";
    }

    public String toCSV() {
        return super.toCSV()
                + rating + ", "
                + horsePower;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }
}
