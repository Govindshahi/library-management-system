 import java.time.LocalDate;
 public class Transaction {
    private Member member;
    private Book book;
    private LocalDate date;
    private String type; // borrow or return
    public Transaction(Member member, Book book, String type) {
        this.member = member;
        this.book = book;
        this.type = type;
        this.date = LocalDate.now();
    }
    public void displayTransaction() {
        System.out.println(type + " - " + member.name + " -> " + book.toString() + " on " + date);
    }
 }

