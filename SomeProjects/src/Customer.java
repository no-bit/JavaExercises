import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList <Double> transactions;

    public Customer(String name){
        this.name = name;
        transactions = new ArrayList<>();
    }

    public Double getTransactionsSum(){
        Double sum =Double.valueOf(0);
        for (Double transaction : transactions){
            sum += transaction;
        }
        return sum;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public double setTransactions(Double number){
        return getTransactionsSum() + number;
    }

    @Override
    public String toString() {
        return name + ":" + transactions;
    }
}
