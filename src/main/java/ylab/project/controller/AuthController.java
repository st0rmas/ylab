package ylab.project.controller;

import ylab.project.in.ConsoleReader;
import ylab.project.service.UserService;

public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }



    public void auth(){
        userService.authUser();
    }


    public void registration(){
        userService.regUser();
    }
}
