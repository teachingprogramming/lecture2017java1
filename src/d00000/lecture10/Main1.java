package d00000.lecture10;

public class Main1 {
    public static void main(String[] args) {
        // (1) プリミティブ型の宣言と初期化
        int a = 0;
        int b = 1;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // (2) プリミティブ型の代入
        b = a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // (3) プリミティブ型の代入
        a = 2;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // (4) 参照型のインスタンス化とフィールドへの代入
        Circle c1 = new Circle();
        c1.radius = 0;
        Circle c2 = new Circle();
        c2.radius = 1;
        System.out.println("c1.radius: " + c1.radius);
        System.out.println("c2.radius: " + c2.radius);

        // (5) 参照型の代入
        c2 = c1;
        System.out.println("c1.radius: " + c1.radius);
        System.out.println("c2.radius: " + c2.radius);

        // (6) 参照型のフィールドに代入
        c1.radius = 2;
        System.out.println("c1.radius: " + c1.radius);
        System.out.println("c2.radius: " + c2.radius);
    }
}
