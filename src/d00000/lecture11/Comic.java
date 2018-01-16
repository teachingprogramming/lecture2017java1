package d00000.lecture11;

public class Comic extends Book {
    /** 巻数 */
    public int volume;
    /** 最新か？ */
    public boolean inOneVolume;

    /** コンストラクタ */
    public Comic(String title, String author, int price, int volume, boolean inOneVolume) {
        super(title, author, price); // スーパークラスのコンストラクタを呼ぶ
        this.volume = volume;
        this.inOneVolume = inOneVolume;
    }

    /** 税込価格を算出（オーバーライド） */
    @Override
    public String getInfoAsCsv() {
        if (inOneVolume) {
            // 全1巻の場合は巻数を出力しない（Bookと同じ）
            return super.getInfoAsCsv();
        } else {
            // 複数巻の場合は巻数を出力する
            return super.getInfoAsCsv() + "," + volume;
        }
    }

    /** タイトルと巻数 */
    public String getTitleWithVolume() {
        if (inOneVolume) {
            return title + "（全1巻）";
        } else {
            return title + "（第" + volume + "巻）";
        }
    }

}
