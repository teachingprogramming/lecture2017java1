package d00000.exam1.p3;

public class CoinBank {
    public int coin1;
    public int coin5;
    public int coin10;
    public int coin50;
    public int coin100;
    public int coin500;

    public CoinBank() {
        coin1 = 100;
        coin5 = 20;
        coin10 = 10;
        coin50 = 2;
        coin100 = 1;
        coin500 = 1;
    }

    public void putCoin(int price) {
        if (price == 1) {
            coin1++;
        } else if (price == 5) {
            coin5++;
        } else if (price == 10) {
            coin10++;
        } else if (price == 50) {
            coin50++;
        } else if (price == 100) {
            coin100++;
        } else if (price == 500) {
            coin500++;
        }
    }

    public int getNumberOfCoins() {
        return coin1 + coin5 + coin10 + coin50 + coin100 + coin500;
    }

    public int getSavings() {
        return coin1 + coin5 * 5 + coin10 * 10 + coin50 * 50 + coin100 * 100 + coin500 * 500;
    }
}
