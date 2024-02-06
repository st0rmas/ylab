package ylab.project.repository;

import ylab.project.model.User;
import ylab.project.storage.UserStorage;
import ylab.project.storage.UserStorageHeap;

public class UserRepository {

    private final UserStorageHeap userStorageHeap;

    public UserRepository(UserStorageHeap userStorageHeap) {
        this.userStorageHeap = userStorageHeap;
    }

    public void saveUser(User user){
        userStorageHeap.addUser(user);
    }

    public boolean isLoginAvailable(String login){
        for (User us : userStorageHeap.getUsers()){
            if (login.equals(us.getLogin())){
                return false;
            }
        }
        return true;
    }
}
