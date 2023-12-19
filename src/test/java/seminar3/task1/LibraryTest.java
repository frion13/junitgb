package seminar3.task1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void addbook() {
        Library library = new Library();
        Book book = new Book("It", "King");
        library.addBook(book);
        List<Book> arrlist = library.searchAvailableBooks();
        assertTrue(arrlist.contains(book));

    }

    @Test
    void removeBook() {
        Library library = new Library();
        Book book = new Book("It", "King");
        library.removeBook(book);
        List<Book> arrlist = library.searchAvailableBooks();
        assertFalse(arrlist.contains(book));

    }

    @Test
    void searchBooksByAuthor() {
        Library library = new Library();
        Book book1 = new Book("It", "King");
        Book book2 = new Book("Отцы и дети", " Достоевский");
        Book book3 = new Book("Вишневый сад", "Чехов");
        Book book4 = new Book("Палата 6", "Чехов");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        List<Book> arrlist = library.searchBooksByAuthor("Чехов");
        assertEquals(2, arrlist.size());
        assertTrue(arrlist.contains(book3));
        assertTrue(arrlist.contains(book4));
        List<Book> arrlist1 = library.searchBooksByAuthor("King");
        assertEquals(1, arrlist1.size());
        assertTrue(arrlist1.contains(book1));



    }

    @Test
    void searchAvailableBooks() {
        Library library = new Library();
        Book book1 = new Book("It", "King");
        Book book2 = new Book("Отцы и дети", " Достоевский");
        Book book3 = new Book("Вишневый сад", "Чехов");
        Book book4 = new Book("Палата 6", "Чехов");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        List<Book> arrlist = library.searchAvailableBooks();
        assertEquals(4, arrlist.size());
    }

    @Test
    void borrowBook() {
        Library library = new Library();
        Book book1 = new Book("It", "King");
        Book book2 = new Book("Отцы и дети", " Достоевский");
        library.addBook(book1);
        library.addBook(book2);
        library.borrowBook(book1);
        List<Book> arrlist = library.searchAvailableBooks();
        assertEquals(1, arrlist.size());
        assertTrue(arrlist.contains(book2));
        assertFalse(arrlist.contains(book1));




    }

    @Test
    void returnBook() {
        Library library = new Library();
        Book book1 = new Book("It", "King");
        Book book2 = new Book("Отцы и дети", " Достоевский");
        library.addBook(book1);
        library.addBook(book2);
        library.borrowBook(book1);
        library.returnBook(book1);
        List<Book> arrlist = library.searchAvailableBooks();
        assertEquals(2, arrlist.size());
        assertTrue(arrlist.contains(book2));
        assertTrue(arrlist.contains(book1));
    }
}