public class SalariedEmployees extends Employee {

    private double salary;


    public SalariedEmployees(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
