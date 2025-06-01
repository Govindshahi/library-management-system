 import java.util.ArrayList;
 import java.util.List;
 public class Member extends Person {
    private List<Book> borrowedBooks;
    public Member(String name, String id) {
        super(name, id);
        borrowedBooks = new ArrayList<>(); }
    public void borrowBook(Book book) {
        if (!book.isAvailable()) {
            System.out.println("Book is already borrowed.");
            return;  }
        borrowedBooks.add(book);
        book.setAvailable(false);    }
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setAvailable(true);
        } else {
            System.out.println("This book wasn't borrowed by this member.");   }
    }
 @Override
    public void displayInfo() {
        System.out.println("Member: " + name + ", ID: " + id);
    }
 }

    

