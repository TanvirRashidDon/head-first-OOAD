package fifth_chapter;

public enum Style {
    A, F;

    @Override
    public String toString() {
        switch (this){
            case A : return "A";
            case F : return "F";
            default: return "Default";
        }
    }
}
