package d00000.practice2.p5;

public class Alcohol extends Product {
    public int price;
    public Alcohol(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
