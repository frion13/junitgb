package seminar5.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Test
    void getUserById() {
// Создаем экземпляр UserRepository (заглушка или реальная реализация)
        UserRepository userRepository = new UserRepository();

// Создаем экземпляр UserService и передаем ему UserRepository
        UserService userService = new UserService(userRepository);

// Вызываем метод getUserById и ожидаем получить пользователя с определенным ID
        int userId = 1; // Предположим, что у нас есть пользователь с ID 1
        User user = userService.getUserById(userId);

// Проверяем, что пользователь был получен
        assertNotNull(user);

// Проверяем, что ID пользователя совпадает с ожидаемым
        assertEquals(userId, user.getId());

// Проверяем, что имя пользователя соответствует ожидаемому (в данном случае "John Doe")
        assertEquals("John Doe", user.getName());
    }
}

