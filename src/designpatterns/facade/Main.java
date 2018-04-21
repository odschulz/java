package designpatterns.facade;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(0, 0);
        Point point = new Point(4, 1);
        point.move(-1, -1);
        System.out.println(point);
        point.rotate(90, center);
        System.out.println(point);
    }
}
