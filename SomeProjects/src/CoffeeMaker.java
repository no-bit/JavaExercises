public class CoffeeMaker extends SmartKitchen {
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(boolean state){
        hasWorkToDo = state;
        if (hasWorkToDo){
            System.out.println("Coffee is brewed");
        }
        hasWorkToDo = false;
    }

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDoToTrue(){
        hasWorkToDo = true;
    }
}
