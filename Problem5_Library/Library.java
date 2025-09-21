import java.util.*;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void add(Book b){ books.add(b); }

    public Book findByTitle(String title){
        // TODO: return first match or null
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                return b;
            }
        }
        return null;
        // throw new UnsupportedOperationException("TODO");
    }

    public ArrayList<Book> borrowedBooks(){
        // TODO: return list of currently borrowed books
        ArrayList<Book> borrowed = new ArrayList<>();
        for (Book b : books) {
            if (b.isBorrowed()) {
                borrowed.add(b);
            }
        }
        return borrowed;
        // throw new UnsupportedOperationException("TODO");
    }
}
