import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> inventory;
    private int capacity;
    private  HashMap<GenreType, inventory> organizedInventory;

    public Library(int capacity){
        this.inventory = new ArrayList<>();
        this.capacity = capacity;
        this.organizedInventory = new HashMap<>();
    }

    public int getTotalBooks(){
        return inventory.size();
    }

    public ArrayList<Book> getInventory(){
        return inventory;
    }

    public void addBook(Book book){
        if (capacity > 0) {
            capacity -= 1;
            this.inventory.add(book);
        }
    }
    public void removeBook(Book book){
        this.inventory.remove(book);
        capacity += 1;
    }
    public void addBookOrganized(Book book){
        if (capacity > 0) {
            capacity -= 1;
            this.organizedInventory.put(book.getGenreType(),);
        }
    }
    public int getTotalByGenre(GenreType genre){
        organizedInventory.get(genre);
    }
}
