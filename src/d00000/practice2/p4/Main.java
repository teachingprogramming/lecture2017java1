package d00000.practice2.p4;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("r1の面積は" + r1.getArea() + "です。");
        Rectangle r2 = new Rectangle(2, 4);
        System.out.println("r2の面積は" + r2.getArea() + "です。");
        Cuboid c1 = new Cuboid();
        System.out.println("c1の表面積は" + c1.getArea() + "で、体積は" + c1.getVolume() + "です。");
        Cuboid c2 = new Cuboid(2, 4, 6);
        System.out.println("c2の表面積は" + c2.getArea() + "で、体積は" + c2.getVolume() + "です。");
    }
}
