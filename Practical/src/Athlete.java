
import java.io.IOException;

public class Athlete {
    public String name;
    public final int Id;
    public static int count = 0;

    public Athlete(String name) {
        this.name = name;
        this.Id = count++;
    }
    public void EditName(String name) throws IOException {
        try {
            if (name == null || name.isEmpty()) {
                throw new IOException("Invalid name");
            } else {
                this.name = name;
            }
        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}
