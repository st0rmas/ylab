package ylab.project.service;

import ylab.project.model.Role;
import ylab.project.model.User;
import ylab.project.repository.UserRepository;
import ylab.project.storage.UserStorage;

import java.util.Scanner;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void authUser(){
        User user = getUser();
        UserStorage.authenticatedUser = user;
    }

    public void regUser(){
        User user = getUser();
        UserStorage.authenticatedUser = user;
        userRepository.saveUser(user);
    }




    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private User getUser(){
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        String login;
        String password;
        do {
            System.out.print("Enter login: ");
            login = scanner.nextLine();
        } while (login.isEmpty());
        if (!userRepository.isLoginAvailable(login)){
            System.out.println("This login is taken. Try again");
            regUser();
        }
        do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        } while (password.isEmpty());

        user.setLogin(login);
        user.setPassword(password);
        user.setRole(Role.USER);
        return user;
    }
}
