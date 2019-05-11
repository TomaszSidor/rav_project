package pl.sda.rav.users;

public class User {
    private String login;
    private String password;
    private UserType userType;

    public User(String login, String password, UserType userType) {
        this.login = login;
        this.password = password;
        this.userType = userType;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public UserType userType() {
        return userType;
    }

    public void userType(UserType userType) {
        this.userType = userType;
    }
}
