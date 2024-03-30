// Main.java (master branch)

class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }
}

// DevOpsEngineer.java (devops-branch)

class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    public double computeTotalSalary() {
        return getSalary() + bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary (including bonus): $" + computeTotalSalary());
    }
}

// Main.java (master branch)

public class devops_engineer {
    public static void main(String[] args) {
        // Creating a DevOpsEngineer instance
        DevOpsEngineer devOpsEngineer = new DevOpsEngineer("John Doe", 1001, 60000, 5000);

        // Displaying employee details including bonus and total salary
        devOpsEngineer.displayDetails();
    }
}
