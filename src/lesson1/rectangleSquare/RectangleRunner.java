package lesson1.rectangleSquare;

public class RectangleRunner{
    static Rectangle r1 = new Rectangle(5, 12);
    static Rectangle r2 = new Rectangle(8, 10);
    static Rectangle r3 = new Rectangle(3, 6);

    public static int sumsquare(){
        int s1 = r1.getSquare(5, 12);
        int s2 = r2.getSquare(8, 10);
        int s3 = r3.getSquare(3, 6);
        return s1 + s2 + s3;
    }

    public static void main(String[] args) {
        sumsquare();
    }
}
