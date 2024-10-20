package cat;

public class Sphere extends Shape {
    private final double radius;

    public Sphere(double r) {
        super("Sphere");
        radius = r;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius; // Luas permukaan bola
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}
