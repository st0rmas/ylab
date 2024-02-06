package ylab.project.controller;

import ylab.project.in.ConsoleReader;
import ylab.project.service.UserService;
import ylab.project.storage.menu.ConsoleMenuWriter;

public class AuthController {
    private final UserService userService;
    private ConsoleReader consoleReader = new ConsoleReader();

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    public void start(){
        ConsoleMenuWriter.authMenu();
        int choice = consoleReader.readValue();
        switch (choice){
            case 1: auth(); break;
            case 2: registration(); break;
            default: break;
        }
        UserController userController = new UserController(userService);
        userController.start();
    }


    private void auth(){
        userService.authUser();
    }


    private void registration(){
        userService.regUser();
    }
}
