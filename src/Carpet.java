public class Carpet {
    private double cost;
    public Carpet(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            cost = 0;
        }
    }
    public double getCost() {
        return cost;
    }
}
