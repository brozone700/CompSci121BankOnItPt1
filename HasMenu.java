/**
 * Contract for any class that presents a menu to the user.
 */
public interface HasMenu {

    /** Prints the menu, reads the user's choice, and returns it. */
    String menu();

    /** Loops: show menu, dispatch to other methods, exit when appropriate. */
    void start();
}
