public class Book {
    private String title;
    private String author;
    private boolean borrowed = false;
    private Borrower borrower = null; // null if not borrowed

    public class Borrower {
        private String name;
        private String date; // simple string date
        public Borrower(String name, String date){ this.name = name; this.date = date; }
        public String getName(){ return name; }
        public String getDate(){ return date; }
    }

    public Book(String title, String author){
        this.title = title; this.author = author;
    }

    public boolean isBorrowed(){ return borrowed; }
    public Borrower getBorrower(){ return borrower; }

    public void borrow(String name, String date){
        // TODO: if already borrowed, throw IllegalStateException
        // else set borrowed=true and create new Borrower
        if (isBorrowed()) {
            throw new IllegalStateException("Book is already borrowed");
        }
        this.borrowed = true;
        this.borrower = new Borrower(name, date);
        return;
        // throw new UnsupportedOperationException("TODO");
    }

    public void giveBack(){
        // TODO: mark returned
        this.borrowed = false;
        this.borrower = null;
        return;
        // throw new UnsupportedOperationException("TODO");
    }

    public String getTitle(){ return title; }
    public String getAuthor(){ return author; }
}
