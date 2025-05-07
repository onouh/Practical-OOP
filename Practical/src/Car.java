public class Car extends Vehicle implements VehicleInterface {
    public boolean isElectric;
    public boolean status;

    public Car() {
        this(false, null, null);
    }

    public Car(boolean isElectric, String licensePlate, String brand) {
        super(licensePlate, brand);
        this.isElectric = isElectric;
    }

    @Override
    public String toString(){
        return "this car is a " + this.brand + " with plate numbers " + this.licensePlate + " and it's status as an electric car is: " + this.isElectric;
    }
    @Override
    public void rentVehicle(String customerID){
        status = true;
    }
    @Override
    public void returnVehicle(String customerID){
        status = false;
    }
    @Override
    public String getVehiclelStatus(){
        if (status) {
            return "this car was rented";
        } else {
            return "this car is available";
        }
    }
    
}
