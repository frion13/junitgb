package seminar4.hw;

import java.util.List;

public interface BookRepository {
    Book findById(int id);
    List<Book> findAll();
}
