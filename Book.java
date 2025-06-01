 public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean status) {
        this.available = status;
    }
    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ") - " +
 (available ? "Available" : "Borrowed");
    }
 }

    

