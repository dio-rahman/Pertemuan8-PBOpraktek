package cat;

public class Paint {

    private final double coverage;

    public Paint(double c) {
        coverage = c;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / coverage; // Menghitung jumlah cat berdasarkan luas area
    }
}