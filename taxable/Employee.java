package taxable;

public class Employee implements Taxable {
    private int empId;
    private String name;
    private long salary;

    public Employee(int empId, String name, long salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public void calTax() {
        System.out.println("tax on yearly salary: "+(this.salary * incomeTax));
    }
}
