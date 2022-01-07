package bot;

import java.util.HashMap;
import java.util.Map;

public class UserStorage implements Storage<User> {
    private final Map<Long, User> userStorage = new HashMap();

    @Override
    public void add(User object) {
        userStorage.put(object.id(), object);
    }

    @Override
    public void delete(User object) {
        userStorage.remove(object.id());
    }

    @Override
    public User get(long id) {
        return userStorage.get(id);
    }
}
