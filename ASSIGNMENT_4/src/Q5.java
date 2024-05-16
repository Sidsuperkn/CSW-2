

import java.util.HashMap;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                ']';
    }
}

public class Q5 {
    public static void main(String[] args) {
        HashMap<Integer, Book> books = new HashMap<>();

        Book book1 = new Book(1, "C++ PROGRAMMING", "BUJJI", 11);
        Book book2 = new Book(2, "C PROGRAMMING", "SIDHU", 14);

        books.put(book1.getId(), book1);
        books.put(book2.getId(), book2);

        for (Book book : books.values()) System.out.println(book);

        String searchBookName = "C++ PROGRAMMING";
        System.out.println("IS \"" + searchBookName + "\" PRESENT IN THE LIBRARAY? " + isBookPresent(books, searchBookName));

        int removeBookId = 2;
        System.out.println("REMOVING BOOK WITH ID " + removeBookId);
        removeBook(books, removeBookId);

        System.out.println("BOOKS IN THE LIBRARY AFTER REMOVAL :");
        
        for (Book book : books.values()) System.out.println(book);
    }

    public static boolean isBookPresent(HashMap<Integer, Book> books, String bookName) {
        for (Book book : books.values()) 
        	if (book.getName().equals(bookName)) return true;
        return false;
    }

    public static void removeBook(HashMap<Integer, Book> books, int bookId) {
        books.remove(bookId);
    }
}
