public class Wall {
    private double height;
    private double width;

    public Wall() {
    }

    public Wall(double width, double height){
        if (width < 0){
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double value){
        width = value;
        if (width < 0){
            width = 0;
        }
    }

    public void setHeight(double value){
        height = value;
        if (height < 0){
            height = 0;
        }
    }

    public double getArea(){
        return height * width;
    }
}
