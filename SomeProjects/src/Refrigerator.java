public class Refrigerator extends SmartKitchen {
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(boolean state){
        hasWorkToDo = state;
        if (hasWorkToDo){
            System.out.println("Food is ordered");
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
