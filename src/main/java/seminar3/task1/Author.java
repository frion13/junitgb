package seminar3.task1;

class Author {
    private String name;

    // Конструктор класса Author для создания автора книги.
    public Author(String name) {
        this.name = name;
    }

    // Геттер для получения имени автора.
    public String getName() {
        return name;
    }
}