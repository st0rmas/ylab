package ylab.project.repository;

import ylab.project.model.User;
import ylab.project.storage.UserStorage;

public class UserRepository {


    public void saveUser(User user){
        UserStorage.users.add(user);
    }

    public boolean isLoginAvailable(String login){
        for (User us : UserStorage.users){
            if (login.equals(us.getLogin())){
                return false;
            }
        }
        return true;
    }
}
