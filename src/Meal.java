public class Meal {
    private Burger burger;
    private Drink drink;
    private String sideItem;

    public Meal(Burger burger, Drink drink, String sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public Meal(){
        Burger burger = new Burger("regular" , 5);
        burger.addToppings(3);
        Drink drink = new Drink("cola", "small");
        sideItem = "fries";
        int sideItemPrice = 1;
        int totalPrice = burger.price + drink.price + sideItemPrice;
    }
}
