package fifth_chapter;

import first_chapter.GuitarSpec;

public abstract class Instrument {
    private String serialNumber;
    private double price;

    public Instrument(String serialNumber, double price){
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public abstract InstrumentSpec getSpec();
}
