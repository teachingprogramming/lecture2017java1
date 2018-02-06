package d00000.practice2.p5;

public class Product {
    /** 商品名 */
    public String name;

    /** 価格 */
    public int getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return name + " " + getPrice() + "円";
    }
}
