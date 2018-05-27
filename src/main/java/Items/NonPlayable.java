package Items;

public class NonPlayable extends Item {
    private String name;

    public NonPlayable (String name, int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
