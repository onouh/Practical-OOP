public class Customer {
    public String ID, name;
    public static int numCus = 0;

    public Customer() {
        this(null, null);
    }

    public Customer(String ID, String name) {
        this.ID = ID;
        this.name = name;
        numCus++;
    }

    public void EditName(String name){
        if (name == null || name.trim().isEmpty()){
            throw new RuntimeException("error, invalid name");
        } else {
            this.name = name;
        }
    }
    
}
