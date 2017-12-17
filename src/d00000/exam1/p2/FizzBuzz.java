package d00000.exam1.p2;

public class FizzBuzz {
    public int fizz;
    public int buzz;

    public FizzBuzz() {
        fizz = 3;
        buzz = 5;
    }

    public FizzBuzz(int fizz, int buzz) {
        this.fizz = fizz;
        this.buzz = buzz;
    }

    public void run(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % fizz == 0 && i % buzz == 0) {
                System.out.println("FizzBuzz");
            } else if (i % fizz == 0) {
                System.out.println("Fizz");
            } else if (i % buzz == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
