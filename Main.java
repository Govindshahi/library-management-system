public class main {
    public static void main(String[] args) {
        Library library = new Library();
        Book b1 = new Book("1984", "George Orwell", "123456");
        Book b2 = new Book("Brave New World", "Aldous Huxley", "654321");
        library.addBook(b1);
        library.addBook(b2);
        Member m1 = new Member("Alice", "M001");
        Member m2 = new Member("Bob", "M002");
        library.registerMember(m1);
        library.registerMember(m2);
        Staff s1 = new Staff("Charles", "S001", "Librarian");
        library.registerStaff(s1);
        s1.manageLibrary();
        library.displayAllBooks();
        library.borrowBook("M001", "123456");
        library.returnBook("M001", "123456");
    }
}

