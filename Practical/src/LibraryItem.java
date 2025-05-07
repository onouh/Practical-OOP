public abstract class LibraryItem {
    String title, author;

    public LibraryItem() {
        this(null, null);
    }

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    
}
