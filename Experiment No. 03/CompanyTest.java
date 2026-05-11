class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    double calculateBonus() {
        return salary * 0.10;
    }

    void performanceReport() {
        System.out.println(jobTitle + " performance is satisfactory.");
    }
}

class Manager extends Employee {

    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    void manageProject() {
        System.out.println("Manager is managing projects.");
    }
}

class Developer extends Employee {

    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    void manageProject() {
        System.out.println("Developer is developing software.");
    }
}

class Programmer extends Employee {

    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    void manageProject() {
        System.out.println("Programmer is writing code.");
    }
}

public class CompanyTest {
    public static void main(String[] args) {
        Manager m = new Manager("Aditi", "Kolhapur", 80000);
        m.performanceReport();
        System.out.println("Bonus: " + m.calculateBonus());
        m.manageProject();
    }
}
