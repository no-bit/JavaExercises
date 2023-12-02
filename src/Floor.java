public class Floor {
    private double width;
    private double length;
    public Floor(double width, double length) {
        if (width > 0) {
            this.width = width;
        } else {
            width = 0;
        }
        if (length > 0) {
            this.length = length;
        } else {
            length = 0;
        }
    }
    public double getArea() {
        return width * length;
    }
}