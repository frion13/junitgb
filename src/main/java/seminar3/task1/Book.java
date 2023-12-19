package seminar3.task1;

class Book {
    private String title;
    private String author;
    private boolean available;

    // Конструктор класса Book для создания новой книги.
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; // Изначально книга доступна.
    }

    // Геттеры для получения информации о книге.
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    // Метод для аренды книги. Если книга доступна, она становится недоступной. В противном случае, выбрасывается исключение.
    public void borrow() {
        if (available) {
            available = false;
        } else {
            throw new IllegalStateException("The book is not available for borrowing.");
        }
    }

    // Метод для возврата книги, делает её доступной снова.
    public void returnBook() {
        available = true;
    }
}