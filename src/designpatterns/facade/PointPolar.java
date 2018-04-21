package designpatterns.facade;

class PointPolar  {
    double radius, angle;

    public PointPolar(double radius, double angle) {
        this.radius = radius;
        this.angle = angle;
    }
    public void  rotate(int angle) {
        this.angle += angle % 360;
    }

    public String toString() {
        return "[" + String.format("%.2f", this.radius) + "@" + String.format("%.2f", this.angle) + "]";
    }
}
