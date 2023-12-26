public class Drink {
    protected String type;
    protected String size;
    protected int price;

    public Drink(String type, String size){
        switch (size){
            case "small" -> price = 2;
            case "medium" -> price = 4;
            case "large" -> price = 6;
        }
        this.type = type;
    }
}
