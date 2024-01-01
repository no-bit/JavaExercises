import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        if (customers.isEmpty()){
            customers.add(customer);
        }
        for (Customer c : customers) {
            if (!c.equals(customer)) {
                customers.add(customer);
            }
        }
    }

    public void transaction(Customer customer, double transaction) {
        for (Customer c : customers) {
            if (c.equals(customer)) {
                customer.getTransactions().add(transaction);
            }
        }
        for (double t : customer.getTransactions()) {
            System.out.println(t);
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
