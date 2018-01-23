package d00000.lecture12;

import d00000.lecture11.Book;
import d00000.lecture11.Comic;

public class Main2 {
    public static void main(String[] args) {
        Object[] objectList = new Object[4];
        objectList[0] = "文字列";
        objectList[1] = new Book("ブック", "著者1", 1000);
        objectList[2] = new Comic("コミック", "著者2", 2000, 2, false);
        objectList[3] = new Magazine("雑誌", "編集部", 500, 2018, 1);

        // System.out.printlnでそのまま表示
        System.out.println("そのまま表示");
        for (int i  = 0; i<objectList.length; i++) {
            System.out.println(objectList[i]);
        }
        System.out.println();

        // Bookとして扱えるものだけCSVを出力する
        System.out.println("Bookとして扱えるものだけCSVを出力する");
        for (int i  = 0; i<objectList.length; i++) {
            if (objectList[i] instanceof Book) {
                Book b = (Book)objectList[i];
                System.out.println(b.getInfoAsCsv());
            }
        }
        System.out.println();
    }
}
