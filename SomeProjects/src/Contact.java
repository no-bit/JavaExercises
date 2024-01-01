import java.util.Objects;

public class Contact {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("sdfjds");
        System.out.println(mobilePhone.addNewContact((createContact("Burak", "3445"))));
        System.out.println(mobilePhone.addNewContact((createContact("Burak", "3445"))));
        mobilePhone.printContacts();

    }

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
    // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Contact)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Contact c = (Contact) o;

        // Compare the data members and return accordingly
        return (Objects.equals(name, c.name)) &&
                (Objects.equals(phoneNumber, c.phoneNumber));
    }
}

