package d00000.lecture10;

public class Main2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        if (a == b) {
            System.out.println("aとbは同じ");
        } else {
            System.out.println("aとbは違う");
        }

        Circle c1 = new Circle();
        c1.radius = 1;
        Circle c2 = new Circle();
        c2.radius = 1;

        if (c1 == c2) {
            System.out.println("c1とc2は同じ");
        } else {
            System.out.println("c1とc2は違う");
        }
    }
}
