package first_chapter;

public class Guitar {
    private String serialNumber, model;
    private double price;
    private Wood backWood;
    private Wood topWood;
    private Type type;
    private Builder builder;

    public Guitar(String serialNumber, Builder builder, String model, Type type, Wood backWood, Wood topWood, double price) {
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
