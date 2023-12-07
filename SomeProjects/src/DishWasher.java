public class DishWasher extends SmartKitchen{
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(boolean state){
        hasWorkToDo = state;
        if (hasWorkToDo){
            System.out.println("Dishes are cleaned");
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
