public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired){
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        terminate("12/12/2023");
        isRetired = true;
    }

    @Override
    public double collectPay(){
        int salary = (int) annualSalary / 26;
        return (isRetired) ? salary * 0.9 : salary;
    }
    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired + '\'' +
                "} " + super.toString();
    }
}


