package d00000.lecture12;

import d00000.lecture11.Book;

public class Magazine extends Book {
    public int year;
    public int month;

    public Magazine(String title, String author, int price, int year, int month) {
        super(title, author, price);
        this.year = year;
        this.month = month;
    }

    @Override
    public String getInfoAsCsv() {
        return super.getInfoAsCsv() + "," + year + "年" + month + "月";
    }

    @Override
    public String toString() {
        return title + " " + year + "年" + month + "号";
    }

    // 注: このequalsメソッドはサンプルのため不十分
    // IDEで生成するかLombokを利用する方が良い
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Magazine)) {
            return false;
        }
        Magazine another = (Magazine)object;
        if (!title.equals(another.title)) {
            return false;
        }
        if (!author.equals(another.author)) {
            return false;
        }
        if (price != another.price) {
            return false;
        }
        if (year != another.year) {
            return false;
        }
        if (month != another.month) {
            return false;
        }
        return true;
    }
}
