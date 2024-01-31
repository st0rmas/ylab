package ylab.project.model;

import ylab.project.storage.UserStorage;

import java.util.Enumeration;
import java.util.Objects;

public class User {
    private static Long currentId = 0L;
    private Long id;
    private String login;
    private String password;

    private Role role;

    private Meter meter;

    public User(){}
    public User(String login, String password) {
        this.id = currentId++;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


}
