package d00000.practice2.p4;

public class Cuboid extends Rectangle {
    public int z;

    public Cuboid() {
        super();
        z = 5;
    }

    public Cuboid(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public int getArea() {
        return (x * y + y * z + z * x) * 2;
    }

    public int getVolume() {
        return x * y * z; // super.getArea() * z
    }

}
