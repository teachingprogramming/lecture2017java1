package d00000.exam1.p2;

public class Main {
    public static void main(String[] args) {
        System.out.println("10から30のFizzBuzz");
        FizzBuzz fizzBuzz1 = new FizzBuzz();
        fizzBuzz1.run(10, 30);

        System.out.println(); // 空行を出力

        System.out.println("20から40のFizzBuzz（5でFizz、7でBuzz）");
        FizzBuzz fizzBuzz2 = new FizzBuzz(5, 7);
        fizzBuzz2.run(20, 40);
    }
}
