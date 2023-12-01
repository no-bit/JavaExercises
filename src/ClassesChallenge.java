public class ClassesChallenge {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountBalance(1000);
        bankAccount.setAccountNumber("666");
        bankAccount.setCustomerName("Burak");
        bankAccount.setEmail("default@gmail.com");
        bankAccount.setPhoneNumber("666 666 66 66");
        bankAccount.deposit(500);
        bankAccount.withdrawal(1400);
        System.out.println(bankAccount.getCustomerName());
    }
}
