package seminar4.hw;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    void testFindBookById() {
        // Создаем мок-объект BookRepository
        BookRepository bookRepository = mock(BookRepository.class);

        // Создаем объект BookService, передавая мок-объект в конструктор
        BookService bookService = new BookService(bookRepository);

        // Устанавливаем поведение мок-объекта при вызове findBookById
        int bookId = 1;
        Book expectedBook = new Book(bookId, "Title", "Author");
        when(bookRepository.findById(bookId)).thenReturn(expectedBook);

        // Вызываем метод findBookById у BookService
        Book actualBook = bookService.findBookById(bookId);

        // Проверяем, что метод BookService вызвал findBookById с ожидаемым аргументом
        verify(bookRepository).findById(bookId);


        // Проверяем, что результат совпадает с ожидаемым
        assertEquals(expectedBook, actualBook);

    }

    @Test
    void testFindAllBooks() {
        // Создаем мок-объект BookRepository
        BookRepository bookRepository = mock(BookRepository.class);

        // Создаем объект BookService, передавая мок-объект в конструктор
        BookService bookService = new BookService(bookRepository);

        // Устанавливаем поведение мок-объекта при вызове findAllBooks
        List<Book> expectedBooks = Arrays.asList(
                new Book(1, "Title1", "Author1"),
                new Book(2, "Title2", "Author2"),
                new Book(3, "Title3", "Author3")
        );
        when(bookRepository.findAll()).thenReturn(expectedBooks);

        // Вызываем метод findAllBooks у BookService
        List<Book> actualBooks = bookService.findAllBooks();

        // Проверяем, что метод BookService вызвал findAllBooks
        verify(bookRepository).findAll();

        // Проверяем, что результат совпадает с ожидаемым
        assertEquals(expectedBooks, actualBooks);
    }
}