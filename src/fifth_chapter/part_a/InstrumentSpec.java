package fifth_chapter.part_a;

import first_chapter.Builder;
import first_chapter.Type;
import first_chapter.Wood;

public class InstrumentSpec {
    private String model;
    private Wood backWood;
    private Wood topWood;
    private Type type;
    private Builder builder;

    public InstrumentSpec(String model, Wood backWood, Wood topWood, Type type, Builder builder){
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

    public boolean matches(InstrumentSpec otherSpec){
        if ((model != null) && (!model.equals("")) &&
                !model.equals(otherSpec.model))
            return false;
        if (backWood != otherSpec.backWood)
            return false;
        if (topWood != otherSpec.topWood)
            return false;
        if (type != otherSpec.type)
            return false;
        if (builder != otherSpec.builder)
            return false;

        return true;
    }
}
