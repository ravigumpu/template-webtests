package au.gov.nsw.transport.webtest.model;

/**
 * Created with IntelliJ IDEA.
 * User: GumpuR
 * Date: 13/11/13
 * Time: 4:00 PM
 * To change this template use File | Settings | File Templates.
 */
public enum User {
    USER("tams_officer", "password1!");
    private final String username;
    private final String password;

    private User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}