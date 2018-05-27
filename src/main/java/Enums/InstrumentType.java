package Enums;

public enum InstrumentType {
    GUITAR("Twang twang");

    private String value;

    InstrumentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
