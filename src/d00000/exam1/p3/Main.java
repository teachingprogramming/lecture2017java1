package d00000.exam1.p3;

public class Main {
    public static void main(String[] args) {
        CoinBank coinBank = new CoinBank();
        coinBank.putCoin(10);
        coinBank.putCoin(100);
        coinBank.putCoin(10);
        coinBank.putCoin(1000);
        coinBank.putCoin(500);
        coinBank.putCoin(5);
        int noc = coinBank.getNumberOfCoins();
        int s = coinBank.getSavings();
        System.out.println("貯金箱には" + noc + "枚のコインが入っていて、合計金額は" + s + "円です。");
    }
}
