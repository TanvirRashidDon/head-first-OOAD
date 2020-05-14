package first_chapter;

public class GuitarSpec {
    private String model;
    private Wood backWood;
    private Wood topWood;
    private Type type;
    private Builder builder;

    public GuitarSpec(String model, Wood backWood, Wood topWood, Type type, Builder builder) {
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
        this.type = type;
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public Type getType() {
        return type;
    }

    public Builder getBuilder() {
        return builder;
    }
}
