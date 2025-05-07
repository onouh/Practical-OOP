public abstract class Room {
    public int roomNumber, floor;

    public Room() {
        this(0, 0);
    }

    public Room(int roomNumber, int floor) {
        this.roomNumber = roomNumber;
        this.floor = floor;
    }

    
}
