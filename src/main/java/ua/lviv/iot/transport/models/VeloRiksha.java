package ua.lviv.iot.transport.models;

public class VeloRiksha extends Transport {
    private String model;
    private double wheelsDiameter;

    public VeloRiksha(final LengthType length, final WeightType weight,
                      final double price, final String model, final double wheelsDiameter) {
        super(length, weight, price);
        this.model = model;
        this.wheelsDiameter = wheelsDiameter;
    }

    public String getHeaders() {
        return super.getHeaders()
                + "model, "
                + "wheelsDiameter, ";
    }

    public String toCSV() {
        return super.toCSV()
                + model + ", "
                + wheelsDiameter;
    }

    public final String getModel() {
        return model;
    }

    public final void setModel(final String model) {
        this.model = model;
    }

    public double getWheelsDiameter() {
        return wheelsDiameter;
    }

    public void setWheelsDiameter(double wheelsDiameter) {
        this.wheelsDiameter = wheelsDiameter;
    }
}
