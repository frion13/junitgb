package seminar4.task1;

public class UserService {
    private DatabaseConnection database;

    public UserService(DatabaseConnection database) {
        this.database = database;
    }

    public boolean createUser(User user) {
// Взаимодействие с базой данных для создания пользователя
        return database.insertUser(user);
    }

    public User getUserById(int userId) {
// Взаимодействие с базой данных для получения пользователя
        return database.getUserById(userId);
    }
}
