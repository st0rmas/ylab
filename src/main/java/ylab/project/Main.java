package ylab.project;

import ylab.project.controller.AuthController;
import ylab.project.in.ConsoleReader;
import ylab.project.repository.UserRepository;
import ylab.project.service.UserService;
import ylab.project.storage.UserStorage;
import ylab.project.storage.UserStorageHeap;

import java.io.PrintStream;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        UserStorageHeap userStorage = new UserStorageHeap();
        UserRepository userRepository = new UserRepository(userStorage);
        UserService userService = new UserService(userRepository);
        AuthController authController = new AuthController(userService);
        authController.start();
    }
}
