package Items;

import Enums.InstrumentType;

public class Piano extends Playable {
    private String instrumentNoise;

    public Piano(String make, String model, InstrumentType instrumentType, int buyPrice, int sellPrice) {
        super(make, model, instrumentType, buyPrice, sellPrice);
        this.instrumentNoise = instrumentType.getValue();
    }

    public String playSound() {
        return this.instrumentNoise;
    }
}
