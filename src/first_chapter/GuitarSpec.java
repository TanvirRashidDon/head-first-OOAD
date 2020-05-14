package first_chapter;

public class GuitarSpec {
    private String model;
    private Wood backWood;
    private Wood topWood;
    private Type type;
    private Builder builder;
    private int numString;

    public GuitarSpec(String model, Wood backWood, Wood topWood, Type type, Builder builder, int numString) {
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
        this.type = type;
        this.builder = builder;
        this.numString = numString;
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

    public int getNumString(){ return numString; }

    public boolean matches(GuitarSpec otherSpec){
        if (model != otherSpec.model)
            return false;
        if (backWood != otherSpec.backWood)
            return false;
        if (topWood != otherSpec.topWood)
            return false;
        if (type != otherSpec.type)
            return false;
        if (builder != otherSpec.builder)
            return false;
        if (numString != otherSpec.numString)
            return false;

        return true;
    }
}
