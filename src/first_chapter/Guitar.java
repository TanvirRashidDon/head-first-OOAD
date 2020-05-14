package first_chapter;

public class Guitar {
    private String serialNumber, builder, model, type;
    private double price;
    private Wood backWood;
    private Wood topWood;

    public Guitar(String serialNumber, String builder, String model, String type, Wood backWood, Wood topWood, double price) {
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

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
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
