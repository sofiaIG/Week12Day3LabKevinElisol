package staff;

public abstract class Employee {

    private String name;
    private String nationalInsuranceNumber;
    private double salary;

    public Employee(String name, String nationalInsuranceNumber, double salary) {
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }

    public void setName(String name) {
        if (name != null){this.name = name;}
    }

    public String getName() {
        return name;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raiseAmount){
        if (raiseAmount>0){
            salary = salary * raiseAmount;
        }

    }

    public double payBonus(){
        return this.salary* 0.01;
    }
}
