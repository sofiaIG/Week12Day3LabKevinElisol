package staff.managment;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nationalInsuranceNumber, double salary, String departName, double budget) {
        super(name, nationalInsuranceNumber, salary, departName);
        this.budget = budget;
    }


    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        return getSalary() *0.02;
    }

}


