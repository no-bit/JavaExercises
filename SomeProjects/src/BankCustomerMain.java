public class BankCustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Burak");
        Customer customer2 = new Customer("Aysin");
        Bank bank = new Bank("Central Bank");
        bank.addCustomer(customer);
        bank.addCustomer(customer2);
        bank.transaction(customer,-1000);
        System.out.println(customer.getTransactions());
        System.out.println(bank.getCustomers());
    }


}
