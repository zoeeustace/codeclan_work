import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private Integer capacity;

    public Library(Integer capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getBookCount(){
        return this.books.size();
    }

    public boolean checkCapacity(){
        if(this.capacity > books.size());
        return true;
    }

    public void addBook(Book book){
        this.books.add(book);
    }
}
