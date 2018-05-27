package Items;

import Enums.InstrumentType;
import Interfaces.IPlay;

public abstract class Playable extends Item implements IPlay {
    private String make;
    private String model;
    private InstrumentType instrument;

    public Playable(String make, String model, InstrumentType instrument, int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
        this.make = make;
        this.model = model;
        this.instrument = instrument;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public InstrumentType getInstrumentType() {
        return this.instrument;
    }
}
