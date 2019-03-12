package ua.lviv.iot.transport.models;

public class VeloRiksha extends Transport {
    private String model;

    public VeloRiksha(LengthType length, WeightType weight, double price) {
        super(length, weight, price);
    }

    public VeloRiksha(LengthType length, WeightType weight, double price, String model) {
        super(length, weight, price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
