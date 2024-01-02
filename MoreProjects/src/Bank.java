import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) {
            return false;
        }
        Branch branch = new Branch(name);
        branches.add(branch);
        return true;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if (findBranch(branchName) != null) {
            return (findBranch(branchName).addCustomerTransaction(customerName, transaction));
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        if (findBranch(branchName) == null) {
            return false;
        }
        return (findBranch(branchName).newCustomer(customerName, transaction));
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        if (findBranch(branchName) != null) {
            System.out.println("Customer details for branch " + branchName);
            int customerNumber = 1;
            for (Customer customer : findBranch(branchName).getCustomers()) {
                System.out.println("Customer: " + customer.getName() + "[" + customerNumber + "]");
                customerNumber++;
                if (printTransactions) {
                    System.out.println("Transactions");
                    int transactionNumber = 1;
                    for (double transaction : customer.getTransactions()) {
                        System.out.println("[" + transactionNumber + "] " + "Amount " + transaction);
                        transactionNumber++;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
