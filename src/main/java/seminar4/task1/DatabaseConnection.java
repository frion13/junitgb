package seminar4.task1;

public interface DatabaseConnection {
    void connect();
    void disconnect();
    boolean isConnected();
    boolean insertUser(User user);
    User getUserById(int userId);
}
