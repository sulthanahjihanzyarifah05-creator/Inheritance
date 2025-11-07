
package Latihan3;

public class Main {
    public static void main(String[] args) {
        // Buat array Shape
        Shape[] shapes = {
            new Triangle(10, 5),
            new Rectangle(4, 6),
            new Circle(7)
        };

        double totalArea = 0;

        // Hitung total area semua shape
        for (Shape s : shapes) {
            double a = s.area();
            System.out.println(s.getClass().getSimpleName() + " area = " + a);
            totalArea += a;
        }

        System.out.println("\nTotal area semua shape = " + totalArea);
    }
}
