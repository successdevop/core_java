package book;

import java.util.ArrayList;
import java.util.List;

public class BookStore{
    private final List<Book> books;

    public BookStore(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(new Book(book));
    }

    public Book getABook(int index){
        return new Book(books.get(index));
    }

    public void setBook(int index, Book book){
        this.books.set(index, new Book(book));
    }

    public void sellBook(String bookTitle){
        for (int i = 0; i < this.books.size(); i++){
            if (this.books.get(i).getTitle().equalsIgnoreCase(bookTitle)){
                this.books.remove(i);
                break;
            }
        }
    }

    public boolean contains(Book book){
        return this.books.contains(book);
    }
}