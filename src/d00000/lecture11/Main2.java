package d00000.lecture11;

public class Main2 {
    public static void main(String[] args) {
        Comic[] comicList = new Comic[5];
        comicList[0] = new Comic("ドラえもん", "藤子・F・不二雄", 500, 1, false);
        comicList[1] = new Comic("ドラえもん", "藤子・F・不二雄", 500, 2, false);
        comicList[2] = new Comic("永沢君", "さくらももこ", 700, 1, true);
        comicList[3] = new Comic("クレヨンしんちゃん", "臼井儀人", 800, 1, false);
        comicList[4] = new Comic("クレヨンしんちゃん", "臼井儀人", 800, 2, false);

        // タイトル一覧
        System.out.println("タイトル一覧");
        for (Comic comic : comicList) {
            System.out.println(comic.getTitleWithVolume());
        }

        System.out.println("-- CSV出力 ここから --");
        for (Comic comic : comicList) {
            System.out.println(comic.getInfoAsCsv());
        }
        System.out.println("-- CSV出力 ここまで --");
    }
}
