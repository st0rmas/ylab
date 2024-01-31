package ylab.project.storage;

import ylab.project.model.User;

import java.util.*;

public class UserStorage {
    public static User authenticatedUser;
    public static List<User> users = new ArrayList<>(Arrays.asList(new User("admin", "admin")));



}
