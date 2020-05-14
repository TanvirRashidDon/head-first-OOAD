package fifth_chapter.part_b;

public class InstrumentFinal {
    private String serialNumber;
    private double price;

    private InstrumentSpecFinal instrumentSpec;

    public InstrumentFinal(String serialNumber, double price, InstrumentSpecFinal instrumentSpec){
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;
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

    public InstrumentSpecFinal getSpec(){
        return instrumentSpec;
    }
}
