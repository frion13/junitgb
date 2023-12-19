package seminar3.task1;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    //конструктор класса Library для создания библиотеки с начальным пустым списком книг
    public  Library(){
        this.books = new ArrayList<>();
    }
    //метод для добавления книги в библиотеку
    public  void addBook(Book book){
        books.add(book);
    }

    // Метод для удаления книги из библиотеки.
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Метод для поиска книг по имени автора и возвращения списка найденных книг.
    public List<Book> searchBooksByAuthor(String authorName) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(authorName)) {
                result.add(book);
            }
        }
        return result;
    }

    // Метод для поиска доступных книг и возвращения списка найденных книг.
    public List<Book> searchAvailableBooks() {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                result.add(book);
            }
        }
        return result;
    }

    // Метод для аренды книги.
    public void borrowBook(Book book) {
        book.borrow();
    }

    // Метод для возврата книги.
    public void returnBook(Book book) {
        book.returnBook();
    }
}
