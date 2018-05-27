package Enums;

public enum InstrumentType {
    GUITAR("twang twang"),
    PIANO("plink plonk");

    private String value;

    InstrumentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
