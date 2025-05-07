public class GymEquipment implements Equipment, EquipmentUsageInterface {
    private String serialNumber;
    double equipmentPrice;
    int equipmentSize;
    boolean isAvailable = true;

    public GymEquipment() {
        this(null);
    }

    public GymEquipment(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public double getEquipmentPrice() {
        return this.equipmentPrice;
    }

    @Override
    public int getEquipmentSize() {
        return this.equipmentSize;
    }

    @Override
    public void useEquipment(String athleteID) {
        if (isAvailable) {
            System.out.println("Equipment " + serialNumber + " is now in use by athlete " + athleteID);
            isAvailable = false; // Mark as not available
        } else {
            System.out.println("Equipment " + serialNumber + " is currently not available.");
        }
    }

    @Override
    public void releaseEquipment(String athleteID) {
        if (!isAvailable) {
            System.out.println("Equipment " + serialNumber + " has been released by athlete " + athleteID);
            isAvailable = true; // Mark as available again
        } else {
            System.out.println("Equipment " + serialNumber + " is already available.");
        }
    }

    @Override
    public boolean getEquipmentStatus() {
        return isAvailable;
    }
    
    @Override
    public boolean equals(Object obj) {
        /* if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GymEquipment that = (GymEquipment) obj;
        return serialNumber.equals(that.serialNumber); */
        if (obj instanceof GymEquipment) {
            return this.serialNumber.equals(((GymEquipment)obj).serialNumber);
        } else {
            return false;
        }
    }

}
