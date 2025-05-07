public abstract class Vehicle {
    public String licensePlate, brand;

    public Vehicle() {
        this(null, null);
    }

    public Vehicle(String licensePlate, String brand) {
        this.licensePlate = licensePlate;
        this.brand = brand;
    }
    
}
