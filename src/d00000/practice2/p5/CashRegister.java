package d00000.practice2.p5;

public class CashRegister {

    public int check(Product[] products) {
        int total = 0;
        for (int i=0; i<products.length; i++) {
            Product p = products[i];
            total += p.getPrice();
        }
        return total;
    }

    public int checkWithoutAlcohol(Product[] products) {
        int total = 0;
        for (Product p : products) {
            if (p instanceof Alcohol) {
                // 何もしない
            } else {
                total += p.getPrice();
            }
        }
        return total;
    }

}
