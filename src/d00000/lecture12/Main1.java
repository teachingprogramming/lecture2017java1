package d00000.lecture12;

import d00000.lecture11.Book;
import d00000.lecture11.Comic;


public class Main1 {
    public static void main(String[] args) {

        Book book = new Book("ブック", "作者A", 1000);
        Comic comic = new Comic("コミック", "作者B", 2000, 1, false);

        // スーパークラスのインスタンスとして名前をつけることができる。
        Book comicAsBook = (Book)comic;

        // comicとcomicAsBookは同じインスタンスだが、comicAsBookで使うとBookのインスタンスという扱いになる。
        // つまりBookのメンバーしか使えない
        System.out.println(comic.getTitleWithVolume());
        // System.out.println(comicAsBook.getTitleWithVolume()); // コンパイルエラーになるためコメントにしてある

        // スーパークラスの配列にサブクラスのインスタンスを入れることができる。
        Book[] bookList = new Book[2];
        bookList[0] = book;
        bookList[1] = comic;
        // 上記は
        // bookList[1] = comicAsBook;
        // あるいは
        // bookList[1] = (Book)comic;
        // と同じ

        // comicAsBookの場合と同様にbookList[1]に入っているのはComicクラスのインスタンスだが
        // Comicクラスのメソッドは使えない。
        // System.out.println(bookList[1].getTitleWithVolume()); // コンパイルエラーになるためコメントにしてある

        // オーバーライドしたメソッドはどちらが使われるか。
        System.out.println(comic.getTaxIncludedPrice());
        System.out.println(comicAsBook.getTaxIncludedPrice());
        // どちらの型で呼ばれているかに関係なく、インスタンスの型のメソッドが使われる
        // 配列の場合も同様
        for (int i=0; i<bookList.length; i++) {
            System.out.println(bookList[i].getInfoAsCsv());
        }
    }
}
