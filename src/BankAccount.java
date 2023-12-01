public class BankAccount {
    private String accountNumber;
    private String phoneNumber;
    private int accountBalance;
    private String customerName;
    private String email;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void deposit(int amount){
        if (amount < 0) {
            System.out.println("Invalid");
        } else {
            accountBalance += amount;
            System.out.println("Your account balance is " + accountBalance);
        }
    }
    public void withdrawal(int amount){
        if (amount > 0 || amount < accountBalance) {
            accountBalance -= amount;
            System.out.println("Your account balance is " + accountBalance);
        } else {
            System.out.println("Invalid");
        }
    }
}
