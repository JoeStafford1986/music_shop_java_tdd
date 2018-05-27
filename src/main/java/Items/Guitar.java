package Items;

import Enums.InstrumentType;

public class Guitar extends Playable {
    private String instrumentNoise;

    public Guitar(String make, String model, InstrumentType instrumentType, int buyPrice, int sellPrice) {
        super(make, model, instrumentType, buyPrice, sellPrice);
        this.instrumentNoise = instrumentType.getValue();
    }

    public String playSound() {
        return this.instrumentNoise;
    }
}
