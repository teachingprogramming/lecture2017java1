package d00000.practice2.p4;

public class Rectangle {
    public int x;
    public int y;

    public Rectangle() {
        this.x = 1;
        this.y = 3;
    }

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getArea() {
        return x * y;
    }

}
