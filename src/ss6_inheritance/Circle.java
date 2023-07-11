package ss6_inheritance;

public class Circle {
    //    thanh phan radius va color khong cho phep ke thua
    private double radius;
    private String color;

    //  2 constructor khong cho phep ke thua
    //  2 constructor la overload
    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //  cac phuong thuc getter & setter cho phep ke thua
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //    phuong thuc getArea cho phep ke thua
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    // phuong thuc toString là override
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
