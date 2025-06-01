 import java.util.*;
 public class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Staff> staff;
    private List<Transaction> transactions;
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        staff = new ArrayList<>();
        transactions = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void registerMember(Member member) {
        members.add(member);
    }
    public void registerStaff(Staff staffMember) {
        staff.add(staffMember);
    }
    public void borrowBook(String memberId, String isbn) {
        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);
 if (member != null && book != null && book.isAvailable()) {
            member.borrowBook(book);
            Transaction transaction = new Transaction(member, book, "Borrow");
            transactions.add(transaction);
            transaction.displayTransaction();
        } else {
            System.out.println("Borrow operation failed.");
        }
    }
    public void returnBook(String memberId, String isbn) {
        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);
        if (member != null && book != null) {
            member.returnBook(book);
            Transaction transaction = new Transaction(member, book, "Return");
            transactions.add(transaction);
            transaction.displayTransaction();
        } else {
            System.out.println("Return operation failed.");
        }
    }
    private Member findMemberById(String id) {
        for (Member m : members) {
            if (m.id.equals(id)) return m;
        }
        return null;
    }
    private Book findBookByIsbn(String isbn) {
        for (Book b : books) {
            if (b.toString().contains(isbn)) return b;
        }
        return null;
    }
    public void displayAllBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
 }

