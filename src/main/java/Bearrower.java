import java.util.ArrayList;

public class Bearrower {
    private ArrayList<Book> collection;
    public Bearrower(){
        this.collection = new ArrayList<>();
    }

    public int getTotalCollection(){
        return collection.size();
    }

    public void borrow(Book book, Library library){
        library.removeBook(book);
        this.collection.add(book);
    }
}
