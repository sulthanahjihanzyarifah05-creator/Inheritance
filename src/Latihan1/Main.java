
package Latihan1;

public class Main {
  
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car();
        vehicles[1] = new Motorcycle();

        // Jalankan method start() untuk tiap kendaraan
        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}