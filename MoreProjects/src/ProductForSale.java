import java.util.ArrayList;

public abstract class ProductForSale{
    protected String type;
    protected int price;
    protected String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public int getSalesPrice(int quantity){
        return price * quantity;
    }

    public void printPricedLineItem(int quantity){
        System.out.println("quantity: " + quantity + " price: " + getSalesPrice(quantity) +
                " description: " + description);
    }

    public abstract void showDetails();
}

record OrderItem(int quantity, ProductForSale product){}
