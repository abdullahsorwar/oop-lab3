import java.util.*;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void add(Book b){ books.add(b); }

    public Book findByTitle(String title){
        // TODO: return first match or null
        throw new UnsupportedOperationException("TODO");
    }

    public ArrayList<Book> borrowedBooks(){
        // TODO: return list of currently borrowed books
        throw new UnsupportedOperationException("TODO");
    }
}
