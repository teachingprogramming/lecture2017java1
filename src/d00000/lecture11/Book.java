package d00000.lecture11;

public class Book {
    /** 書籍名 */
    public String title;
    /** 著者 */
    public String author;
    /** 本体価格 */
    public int price;

    /** コンストラクタ */
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /** 税込価格を算出 */
    public int getTaxIncludedPrice() {
        return (int) (price * 1.08);
    }

    /** 情報をCSV形式（カンマ区切り）で取得 */
    public String getInfoAsCsv() {
        String csv = title + "," + author + "," + getTaxIncludedPrice();
        return csv;
    }

}
