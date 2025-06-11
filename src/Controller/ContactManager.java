package Controller;

import java.util.LinkedList;

import Model.Contact;

public class ContactManager {
    private LinkedList<Contact> contacts = new LinkedList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public Contact findContactByName(String name) {

        for (Contact contact : contacts) {
            
            if (contact.getName().equalsIgnoreCase(name)) {
                
                return contact;
            }
        }
        
        return null;
    }

    public void deleteContactByName(String name) {

        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
   
    }


    public void printList() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
