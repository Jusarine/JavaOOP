package lesson1.rectangleSquare;

/**
 * Created by Tania on 01.07.2016.
 */
/*
Написать класс rectangleSquare (Прямоугольник), содержащий размеры (высоту и ширину), и умеющий подсчитывать свои периметр и площадь.
Написать клиентский класс RectangleRunner, создающий список прямоугольников и подсчитывающий их суммарную площадь.
 */
public class Rectangle {
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public Rectangle setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Rectangle setWidth(int width) {
        this.width = width;
        return this;
    }

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    public int getSquare(int width, int height){
        return width * height;
    }
    public int getPerimeter(int width, int height){
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
