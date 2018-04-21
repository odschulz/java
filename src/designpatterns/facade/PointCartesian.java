package designpatterns.facade;

class PointCartesian {

    double x, y;

    public PointCartesian(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "(" + String.format("%.2f", this.x) + "," + String.format("%.2f", this.y) + ")";
    }
}
