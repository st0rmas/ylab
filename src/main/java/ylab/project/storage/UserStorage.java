package ylab.project.storage;


import ylab.project.model.User;

import java.util.List;

// интерфейс, определяющий, как хранятся пользователи (хранение в памяти, в бд)
public interface UserStorage {

    void addUser(User user);
    List<User> getUsers();

}
