package Items;

public abstract class Playable extends Item {
    private String make;
    private String model;

    public Playable(String make, String model, int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }
}
