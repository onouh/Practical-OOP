public class HotelRoom extends Room implements RoomInterface {
    boolean isEmpty;
    int bookedBy;

    public HotelRoom() {
        this(true, 0, 0,0);
    }

    public HotelRoom(boolean isEmpty, int bookedBy, int roomNumber, int floor) {
        super(roomNumber, floor);
        this.isEmpty = isEmpty;
        this.bookedBy = bookedBy;
    }

    @Override
    public void bookRoom(int guestID){
        isEmpty = false;
    }
    @Override
    public void vacateRoom(int guestID){
        isEmpty = true;
    }
    @Override
    public String getRoomStatus(){
        if (isEmpty) {
            return "room is vacant";
        } else {
            return "room is occupied";
        }
    }
    @Override
    public String toString(){
        return "room " + this.roomNumber + ", located on floor " + this.floor + "vacancy status: " + this.isEmpty;
    }
}
