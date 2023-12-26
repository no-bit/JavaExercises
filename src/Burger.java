public class Burger {
    protected String type;
    protected int price;
    protected int extraToppings;

    public Burger(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public Burger(){
        type = "regular";
        price = 3;

    }

    public void addToppings(int extraToppings){
        this.extraToppings = extraToppings;
        price += extraToppings * 2;
    }


}
