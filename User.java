import java.io.Serializable;

/**
 * Abstract base for Customer (and Admin next week). Manages logins.
 */
public abstract class User implements HasMenu, Serializable {

    private String userName;
    private String PIN;

    /** Prompts for userName and PIN, then checks them. */
    public boolean login() {
        // TODO: prompt for user name and PIN, then call login(userName, PIN)
        return false;
    }

    /** Returns true if both values match this user. */
    public boolean login(String userName, String PIN) {
        // TODO
        return false;
    }

    public void setUserName(String userName) {
        // TODO
    }

    public String getUserName() {
        // TODO
        return "";
    }

    public void setPIN(String PIN) {
        // TODO
    }

    public String getPIN() {
        // TODO
        return "";
    }

    /** Each subclass produces its own report. */
    public abstract String getReport();
}
