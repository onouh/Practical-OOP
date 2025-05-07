public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Book livre = new Book("2022", "El Amor", "Nouh");
        Member person = new Member("Omar", "24P0271");
        try {
            person.EditName(null);
        } catch (RuntimeException e) {
            System.err.println("Error");
        }
        Car ford = new Car(false, "HAY0UYA", "Ford");
        Customer human = new Customer("24P0271", "Haya");
        try{
            human.EditName(null);
        } catch (RuntimeException e) {
            System.err.println("Error");
        }
        HotelRoom room = new HotelRoom(false, 2, 1, 1);
        Guest guest = new Guest(1, "Haya");
        try {
            guest.EditID(-1);
        } catch (RuntimeException e) {
            System.err.println("error");
        }
        GymEquipment equipment = new GymEquipment("GYM1234");
        Athlete athlete = new Athlete("John Doe");
        athlete.EditName(null);
    }
}
