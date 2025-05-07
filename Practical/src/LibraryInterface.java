public interface LibraryInterface {
    public void borrowItem(int memberID);
    public void returnItem(int memberID);
    public String getItemStatus();
}
