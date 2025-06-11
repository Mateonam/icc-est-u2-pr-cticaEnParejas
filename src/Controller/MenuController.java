package Controller;
import Model.Contact;
import View.ConsoleView;
public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController(ContactManager contactManager, ConsoleView consoleView) {
        this.contactManager = contactManager;
        this.consoleView = consoleView;
    }

    public void showMenu() {
        boolean running = true;
        while (running) {
            consoleView.displayMenu();
            String choice = consoleView.getInput("Elija una opción: ");

            switch (choice) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printList();
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    consoleView.showMessage("Opción no válida, intente nuevamente.");
            }
        }
    }

    private void addContact() {
        String name = consoleView.getInput("Ingrese un nombre: ");
        String phone = consoleView.getInput("Ingrese un número telefónico: ");
        contactManager.addContact(new Contact(name, phone));
        consoleView.showMessage("Contacto añadido.");
    }

    private void findContact() {
        String name = consoleView.getInput("Ingrese el nombre que desea buscar: ");
        Contact contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage(contact.toString());
        } else {
            consoleView.showMessage("El contacto no existe.");
        }
    }

    private void deleteContact() {
        String name = consoleView.getInput("Ingrese el nombre que desea eliminar: ");
        contactManager.deleteContactByName(name);
        consoleView.showMessage("Si el contacto existe, ha sido eliminado.");
    }

    private void printList() {
        contactManager.printList();
    }
}
