public class Car {
    private String description;

    public Car(String description){
        this.description = description;
    }

    public void startEngine(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println("This is a" + instanceType);
    }

    public void drive(){
        System.out.println("Driving car");
    }

    protected void runEngine(){
        System.out.println("Engine is running");
    }
}

class GasPoweredCar extends Car{
    private double averageKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double averageKmPerLitre, int cylinders){
        super(description);
        this.averageKmPerLitre = averageKmPerLitre;
        this.cylinders = cylinders;

    }

    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("This is an electric car which has " + cylinders + "cylinders and " + averageKmPerLitre + " average km per litre");
    }
}

class ElectricCar extends Car{
    private double averageKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double averageKmPerCharge, int batterySize){
        super(description);
        this.averageKmPerCharge = averageKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("This is an electric car which has " + batterySize + " battery size and " + averageKmPerCharge + "average km per charge");
    }
}


