package book;

public class Main{
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99),
                new Book("1984", "George Orwell", 4.17, 12.99),
                new Book("Moby-Dick", "Herman Melville", 3.5, 14.99),
                new Book("Pride and Prejudice", "Jane Austen", 4.25, 10.99),
        };



        BookStore bookStore = new BookStore();
        for(int i = 0; i < books.length; i++){
            bookStore.addBook(books[i]);
        }

        Book retrievedBook = bookStore.getABook(0);
        System.out.println(retrievedBook.getTitle());

        Book newBook = new Book("Moby", "Melville", 3.5, 20.99);

        bookStore.setBook(0, newBook);
        Book newBook2 =  new Book("Pride and Prejudice", "Jane Austen", 4.25, 10.99);

        System.out.println();
        retrievedBook = bookStore.getABook(0);
        System.out.println(retrievedBook.getTitle());

        System.out.println(bookStore.contains(newBook2));

        bookStore.sellBook("Pride and Prejudice");
        System.out.println(bookStore.contains(newBook2));
    }
}