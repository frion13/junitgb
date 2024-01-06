package seminar5.task2;

public class UserRepository {
    public User getUserById(int userId) {
// Реализация получения пользователя по ID из базы данных или другого источника данных
// В данном примере мы просто вернем заглушку
        return new User("John Doe", userId);
    }
}
