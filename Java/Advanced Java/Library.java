import java.util.*;

public class Library {
    private String openTime = "9am";
    private String closeTime = "5pm";
    private String address;
    private ArrayList<Book> catalog = new ArrayList<Book>();

    public Library(String a) {
        address = a;
    }

    public String getOpenTime() {
        return openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public String getAddress() {
        return address;
    }

    public void addToCatalog(Book b) {
        catalog.add(b);
    }

    public boolean queryCatalog(Book b) {
        return catalog.contains(b);
    }

    public void getCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("No books in catalog");
            return;
        }
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i).getTitle());
        }
    }

    public void borrowBook(Book b) {
        if (!queryCatalog(b)) {
            System.out.println("Book unavailable");
        } else {
            System.out.println("Successfully borrowed: " + b.getTitle());
            b.borrowBook();
        }
    }

    // assumes there will only be one of each book in the library, new books allowed
    public void returnBook(Book b) {
        if (!catalog.contains(b)) {
            addToCatalog(b);
            System.out.println("Successfully returned: " + b.getTitle());
        } else {
            b.returnBook();
            System.out.println("Successfully returned: " + b.getTitle());
        }
    }

    public static void main(String[] args) {
        Book daVinciCode = new Book("The Da Vinci Code");
        Book lePetitePrince = new Book("Le Petite Prince");
        Book taleTwoCities = new Book("A Tale of Two Cities");
        Book siddhartha = new Book("Siddhartha");

        Library first = new Library("10 Main St.");
        Library second = new Library("228 Liberty St.");
        first.addToCatalog(daVinciCode);
        first.addToCatalog(lePetitePrince);
        first.addToCatalog(taleTwoCities);

        System.out.println("\nLibrary hours:\nLibraries are open from " + first.getOpenTime() 
                            + " to " + first.getCloseTime() + "\n");
        System.out.println("Library addresses:\n" + first.getAddress() + "\n" + second.getAddress());
        System.out.println();

        first.borrowBook(daVinciCode);
        first.borrowBook(siddhartha);

        System.out.println("\nBooks available in first library: ");
        first.getCatalog();
        System.out.println("\nBooks available in second library: ");
        second.getCatalog();
        System.out.println();

        Book lordRings = new Book("The Lord of the Rings");
        first.returnBook(lordRings);

        System.out.println("\nBooks available in first library: ");
        first.getCatalog();
    }
    
}