package d00000.practice2.p5;

public class SideDish extends Product{
    public int unitPrice;
    public int amount;

    public SideDish(String name, int unitPrice, int amount) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    @Override
    public int getPrice() {
        return unitPrice * amount;
    }
}
