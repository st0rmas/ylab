package ylab.project.storage;

import ylab.project.model.User;

import java.util.List;


//класс, представляющий собой реализщацию хранилища в памяти
public class UserStorageHeap implements UserStorage {

    public static User authUser;

    private List<User> users;

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
