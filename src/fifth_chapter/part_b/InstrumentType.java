package fifth_chapter.part_b;

public enum InstrumentType {
    GUITAR, BANJO, MANDOLIN;

    @Override
    public String toString() {
        switch (this){
            case GUITAR     : return "Guitar";
            case BANJO      : return "Banjo";
            case MANDOLIN   : return "Mandolin";
            default         : return "Default";
        }
    }
}
