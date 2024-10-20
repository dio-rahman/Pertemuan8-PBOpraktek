package cat;

public class Cylinder extends Shape {
    private final double radius, height;

    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height); // Luas permukaan tabung
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
