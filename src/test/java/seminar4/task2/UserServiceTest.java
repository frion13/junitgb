package seminar4.task2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testUserServiceWithMockRepository() {
// Создаем мок UserRepository
        UserRepository userRepository = mock(UserRepository.class);

// Создаем объект UserService, передавая мок UserRepository
        UserService userService = new UserService(userRepository);

// Задаем ожидаемый результат
        int userId = 1;
        String expectedUsername = "JohnDoe"; // Предположим, что у пользователя с ID 1 такое имя

// Устанавливаем ожидание вызова метода getUserById с userId и возвращаем ожидаемый объект User
        when(userRepository.getUserById(userId)).thenReturn(new User(userId, expectedUsername));

// Вызываем метод getUserUsernameById и проверяем, что результат соответствует ожиданиям
        String username = userService.getUserUsernameById(userId);
        assertEquals(expectedUsername, username);

// Проверяем, что метод getUserById был вызван ровно один раз с правильными аргументами
        verify(userRepository, times(1)).getUserById(userId);
    }
}