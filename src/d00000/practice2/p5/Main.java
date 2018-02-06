package d00000.practice2.p5;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Vegetable("キャベツ", 300);
        products[1] = new SideDish("肉じゃが", 5, 150); // 単価5円で150グラム
        products[2] = new Alcohol("ビール", 230);
        products[3] = new SideDish("かに玉", 7, 200); // 単価7円で200グラム
        products[4] = new Vegetable("もやし", 50);

        System.out.println("購入一覧");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
        System.out.println();

        CashRegister cr = new CashRegister();
        int totalPrice = cr.check(products);
        System.out.println("合計金額は" + totalPrice + "円です。");
        int priceWithoutAlcohol = cr.checkWithoutAlcohol(products);
        System.out.println("お酒抜きの合計金額は" + priceWithoutAlcohol + "円です。");
    }
}
