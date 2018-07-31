import java.util.ArrayList;

public class Library {
    private ArrayList<Book> inventory;
    private int capacity;

    public Library(int capacity){
        this.inventory = new ArrayList<>();
        this.capacity = capacity;
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
}
