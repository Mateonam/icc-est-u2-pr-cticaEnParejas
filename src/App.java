import Controller.*;
import View.ConsoleView;

public class App {
    public static void main(String[] args) throws Exception {
        ConsoleView view = new ConsoleView();

        ContactManager cM = new ContactManager();

        MenuController menu = new MenuController(cM, view);
        menu.showMenu();
    }
}
