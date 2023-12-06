public class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static int empNo = 1;

    public Employee(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}' + super.toString();
    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = empNo++;
        this.hireDate = hireDate;
    }
}
