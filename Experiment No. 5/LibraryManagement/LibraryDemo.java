package LibraryManagement;

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", "12345");
        Member m1 = new Member("Aditi", 100);

        b1.displayBook();
        System.out.println();
        m1.displayMember();
    }
}