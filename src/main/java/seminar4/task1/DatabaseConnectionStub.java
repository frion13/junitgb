package seminar4.task1;

import java.util.HashMap;
import java.util.Map;

public class DatabaseConnectionStub implements DatabaseConnection {
    private Map<Integer, User> users = new HashMap<>();

    @Override
    public void connect() {

    }

    @Override
    public void disconnect() {

    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public boolean insertUser(User user) {
// Заглушка всегда возвращает true для успешного создания пользователя
        users.put(user.getId(), user);
        return true;
    }

    @Override
    public User getUserById(int userId) {
// Заглушка возвращает пользователя из своей памяти, если он есть
        return users.get(userId);
    }
}
