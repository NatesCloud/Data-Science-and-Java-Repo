public class Book {

    private String title;
    private boolean available = true;

    public Book() {
        title = "The Da Vinci Code";
    }

    public Book(String t) {
        title = t;
    }

    public String getTitle() {
        return title;
    }

    //returns availablity to rent
    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }
    public static void main(String[] args) {
        Book myBook = new Book();
        System.out.println(myBook.getTitle());
        System.out.println("Available? " + myBook.isAvailable());
        myBook.borrowBook();
        System.out.println("Available? " + myBook.isAvailable());
        myBook.returnBook();
        System.out.println("Available? " + myBook.isAvailable());
    }
}