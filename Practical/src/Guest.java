public class Guest {
    String name;
    int ID;
    public static int numCus = 0;

    public Guest() {
        this(0, null);
    }

    public Guest(int ID, String name) {
        this.ID = ID;
        this.name = name;
        numCus++;
    }

    public void EditID(int ID){
        if (ID <= 0){
            throw new RuntimeException("error, invalid ID");
        } else {
            this.ID = ID;
        }
    }

}
