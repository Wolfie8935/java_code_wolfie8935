class Employee {
    protected String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    public HRManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager " + super.name + " is managing HR tasks.");
    }

    public void addEmployee(String employeeName) {
        System.out.println("HR Manager " + super.name + " is adding employee: " + employeeName);
    }
}

public class employeee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 50000);
        HRManager hrManager = new HRManager("Alice", 60000);

        emp1.work();
        System.out.println("Employee Salary: $" + emp1.getSalary());

        hrManager.work();
        System.out.println("HR Manager Salary: $" + hrManager.getSalary());

        hrManager.addEmployee("Bob");
    }
}
