public class Book extends LibraryItem implements LibraryInterface{
    public int borrowedBy;
    public String publishYear;
    public boolean status;

    public Book() {
        this(null, null, null);
    }

    public Book(String publishYear, /*int borrowedBy,*/ String title, String author){
        super(title, author);
        this.publishYear = publishYear;
    }

    @Override
    public void borrowItem(int memberID){
        status = true;
    }
    @Override
    public void returnItem(int memberID){
        status = false;
    }
    @Override
    public String getItemStatus(){
        if (status) {
            return "this book is borrowed";
        } else {
            return "this book isn't borrowed";
        }
    }
    @Override
    public String toString(){
        return "Book " + this.title + " published " + this.publishYear + " by " + this.author + getItemStatus();
    }
}
