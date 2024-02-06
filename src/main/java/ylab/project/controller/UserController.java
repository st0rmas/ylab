package ylab.project.controller;

import ylab.project.in.ConsoleReader;
import ylab.project.service.MeasurementService;
import ylab.project.service.UserService;
import ylab.project.storage.menu.ConsoleMenuWriter;

public class UserController {

    private final UserService userService;
    private MeasurementService measurementService = new MeasurementService();
    private ConsoleReader consoleReader = new ConsoleReader();

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void start(){
        ConsoleMenuWriter.userMenu();
        int choice = consoleReader.readValue();
        switch (choice){
            case 1:
                getMeasurements();
                break;
            default:
                break;
        }
    }

    public void getMeasurements(){
        measurementService.getMeasurements();
    }
}
