package ss6_inheritance;

public class Cylinder extends Circle {
    private double height;

    //  2 constructor Cylinder là overload
    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //  phuong thuc getVolume ke thua phuong thuc getArea tu lop Circle
    public double getVolume() {
        return super.getArea() * this.height;
    }

    //  phuong thuc toString là override
    @Override
    public String toString() {
        return "A Cylinder with height is" + this.height
                + " , which is subclass of " + super.toString();
    }
}
