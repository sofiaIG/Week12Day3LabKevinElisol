package staff.managment;

import staff.Employee;

public class Manager extends Employee {

    private String departName;

    public Manager(String name, String nationalInsuranceNumber, double salary, String departName) {
        super(name, nationalInsuranceNumber, salary);
        this.departName = departName;
    }

    public String getDepartName() {
        return departName;
    }

}
