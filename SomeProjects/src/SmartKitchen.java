public class SmartKitchen{
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen(){

    }

    public SmartKitchen(CoffeeMaker brewMaster, Refrigerator iceBox, DishWasher dishWasher ){
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public void setKitchenState(boolean coffee, boolean dish, boolean fridge){
        brewMaster.brewCoffee(coffee);
        iceBox.orderFood(fridge);
        dishWasher.doDishes(dish);
    }

    public void addWater() {
        brewMaster.setHasWorkToDoToTrue();
    }

    public void pourMilk(){
        iceBox.setHasWorkToDoToTrue();
    }

    public void loadDishwasher(){
        dishWasher.setHasWorkToDoToTrue();
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee(brewMaster.getHasWorkToDo());
        iceBox.orderFood(iceBox.getHasWorkToDo());
        dishWasher.doDishes(dishWasher.getHasWorkToDo());
    }
}

