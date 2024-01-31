package ylab.project;

import ylab.project.controller.AuthController;
import ylab.project.in.ConsoleReader;
import ylab.project.repository.UserRepository;
import ylab.project.service.UserService;

import java.io.PrintStream;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        AuthController authController = new AuthController(userService);
        ConsoleReader consoleReader = new ConsoleReader(authController);
        consoleReader.start();
    }
}
