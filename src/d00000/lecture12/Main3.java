package d00000.lecture12;

import d00000.lecture11.Book;

public class Main3 {
    public static void main(String[] args) {
        String s1 = "あいうえお".substring(1, 4); // いうえ
        String s2 = "あいうえお".substring(1, 4); // いうえ

        // 文字列の==による比較
        if (s1 == s2) {
            System.out.println("s1とs2は同じ");
        } else {
            System.out.println("s1とs2は違う");
        }

        // 文字列のequalsメソッドによる比較
        if (s1.equals(s2)) {
            System.out.println("s1とs2は同じ");
        } else {
            System.out.println("s1とs2は違う");
        }

        // equalsメソッドをオーバライドしていないBookの比較
        Book b1 = new Book("ブック", "著者", 1000);
        Book b2 = new Book("ブック", "著者", 1000);
        if (b1.equals(b2)) {
            System.out.println("b1とb2は同じ");
        } else {
            System.out.println("b1とb2は違う");
        }

        // equalsメソッドをオーバライドしているMagazineの比較
        Magazine m1 = new Magazine("雑誌", "編集部", 500, 2018, 1);
        Magazine m2 = new Magazine("雑誌", "編集部", 500, 2018, 1);
        if (m1.equals(m2)) {
            System.out.println("m1とm2は同じ");
        } else {
            System.out.println("m1とm2は違う");
        }

    }
}
