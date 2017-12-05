package d00000.practice1.p1;

public class Rectangle {
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public boolean isSquare() {
        return width == height;
    }
}
