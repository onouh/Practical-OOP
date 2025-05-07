public class Member {
    public String name, ID;
    public static int numMem = 0;

    public Member() {
        this(null, null);
    }

    public Member(String name, String ID) {
        this.name = name;
        this.ID = ID;
        numMem++;
    }

    public void EditName(String name){
        if (name != null || name.trim().isEmpty()) {
            this.name = name;
        }
        else{
            throw new RuntimeException("invalid");
        }
    }

    
}
