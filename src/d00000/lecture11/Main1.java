package d00000.lecture11;

public class Main1 {
    public static void main(String[] args) {
        Book[] bookList = new Book[4];
        bookList[0] = new Book("走れメロス", "太宰治", 2000);
        bookList[1] = new Book("羅生門", "芥川龍之介", 1000);
        bookList[2] = new Book("怪人二十面相", "江戸川乱歩", 3000);
        bookList[3] = new Book("ハリー・ポッター", "J・K・ローリング", 2000);

        // 価格が最も高い本を探す（ただし同じ価格は考慮しない）
        Book expensiveBook = bookList[0];
        for (int i = 1; i < bookList.length; i++) {
            if (expensiveBook.price > bookList[i].price) {
                expensiveBook = bookList[i];
            }
        }
        System.out.println("最も値段が高い本は" + expensiveBook.title + "で" + expensiveBook.getTaxIncludedPrice() + "円です。");

        System.out.println("-- CSV出力 ここから --");
        for (int i = 0; i < bookList.length; i++) {
            System.out.println(bookList[i].getInfoAsCsv());
        }
        System.out.println("-- CSV出力 ここまで --");
    }
}
