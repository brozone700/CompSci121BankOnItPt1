import java.io.Serializable;

public abstract class User implements HasMenu, Serializable {
 
    private String userName;
    private String PIN;
 
    /** Prompts for userName and PIN, then checks them. */
    public boolean login() {
        // TODO: prompt for user name and PIN, then call login(userName, PIN)
        return false;
    }
 
    public boolean login(String userName, String PIN) {
        return this.userName.equals(userName) && this.PIN.equals(PIN);
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getUserName() {
        return userName;
    }
 
    public void setPIN(String PIN) {
        this.PIN = PIN;
    }
 
    public String getPIN() {
        return PIN;
    }
 
    /** Each subclass produces its own report. */
    public abstract String getReport();
}
