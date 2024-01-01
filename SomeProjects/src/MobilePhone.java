import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (!myContacts.contains(contact)) {
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (myContacts.contains(oldContact)) {
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        if (myContacts.contains(contact)) {
            myContacts.remove(myContacts.indexOf(contact));
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (Contact contacts : myContacts) {
            if (contacts.getName().equals(contactName)) {
                return 1;
            }
        }
        return -1;
    }

    public Contact queryContact(String contact) {
        for (Contact contacts : myContacts) {
            if (contacts.getName().equals(contact)) {
                return contacts;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        int number = 1;
        for (Contact contacts : myContacts) {
            System.out.println(number + ". " + contacts.getName() + " -> " + contacts.getPhoneNumber());
            number ++;
        }
    }
}
