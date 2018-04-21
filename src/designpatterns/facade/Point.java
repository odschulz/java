package designpatterns.facade;

/**
 * Facade interface for points.
 */
class Point {
    private PointCartesian point;

    Point(double x, double y) {
        this.point = new PointCartesian(x, y);
    }

    // 4. Wrapper maps
    public void move(double x, double y) {
        this.point.move(x, y);
    }

    public void rotate(int angle, Point o) {
        double x = point.x - o.point.x;
        double y = point.y - o.point.y;
        PointPolar pointPolar = new PointPolar(Math.sqrt(x * x + y * y),Math.atan2(y, x) * 180 / Math.PI);
        pointPolar.rotate(angle);
        double r = pointPolar.radius;
        double a = pointPolar.angle;
        this.point = new PointCartesian(r*Math.cos(a*Math.PI/180) + o.point.x,
                r*Math.sin(a * Math.PI / 180) + o.point.y);
    }

    @Override
    public String toString() {
        return this.point.toString();
    }
}
