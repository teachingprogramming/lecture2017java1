package d00000.exam2.p2;

public class MultiplicationTable {
    public int min;
    public int max;

    public MultiplicationTable(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void print() {
        for (int i = min; i <= max; i++) {
            for (int j = min; j <= max; j++) {
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public int getNumOfMultiple(int factor) {
        int multiple = 0;
        for (int i = min; i <= max; i++) {
            for (int j = min; j <= max; j++) {
                if ((i * j) % factor == 0) {
                    multiple++;
                }
            }
        }
        return multiple;
    }
}
