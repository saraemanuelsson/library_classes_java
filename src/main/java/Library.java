import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String, Integer> booksPerGenre;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
        this.booksPerGenre = new HashMap<String, Integer>();
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if (capacity > bookCount()){
            this.books.add(book);
            addByGenreList(book);
        }
    }

    public boolean checkIfBookInStock(Book book){
        return books.contains(book);
    }

    public Book removeBook(Book book){
        if (checkIfBookInStock(book)) {
            removeFromByGenreList(book);
            return this.books.remove(this.books.indexOf(book));
        }
        return null;
    }

    private void addByGenreList(Book book){
        if (this.booksPerGenre.containsKey(book.getGenre())){
            this.booksPerGenre.put(book.getGenre(), this.booksPerGenre.get(book.getGenre()) + 1);
        } else {
            this.booksPerGenre.put(book.getGenre(), 1);
        }
    }

    private void removeFromByGenreList(Book book){
        if (this.booksPerGenre.get(book.getGenre()) >= 2){
            this.booksPerGenre.put(book.getGenre(), this.booksPerGenre.get(book.getGenre()) - 1);
        } else {
            this.booksPerGenre.remove(book.getGenre());
        }
    }

    public int getBooksByGenre(String genre){
        return this.booksPerGenre.get(genre);
    }

}
