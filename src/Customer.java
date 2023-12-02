public class Customer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public Customer(String customerName, int customerCreditLimit, String customerEmailAddress) {
        name = customerName;
        creditLimit = customerCreditLimit;
        emailAddress = customerEmailAddress;
        System.out.println("Full fledged constructor called");
    }

    public Customer(){
        this("Burak", 666666666, "email.com");
        System.out.println("Empty constructor called");
    }

    public Customer(String customerName, String customerEmailAddress){
        this();
        System.out.println("Two parameter constructor called upon empty constructor");
    }

    public String getName(){
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
