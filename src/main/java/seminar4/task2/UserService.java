package seminar4.task2;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserUsernameById(int userId) {
        User user = userRepository.getUserById(userId);
        return user.getUsername();
    }
}

interface UserRepository {
    User getUserById(int userId);
}

class User {
    private int userId;
    private String username;

    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }
}
