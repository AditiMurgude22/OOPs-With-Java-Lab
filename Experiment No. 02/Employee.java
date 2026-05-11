class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String fName, String lName, double salary) {
        firstName = fName;
        lastName = lName;
        if (salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    // Setter methods
    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public void setMonthlySalary(double salary) {
        if (salary > 0)
            monthlySalary = salary;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // ✅ MAIN METHOD (same class)
    public static void main(String[] args) {

        Employee emp1 = new Employee("John", "Doe", 3000);
        Employee emp2 = new Employee("Jane", "Smith", 4000);

        System.out.println("Yearly Salary of Employee 1: " + emp1.getYearlySalary());
        System.out.println("Yearly Salary of Employee 2: " + emp2.getYearlySalary());

        // 10% salary increase
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        System.out.println("After 10% Raise:");
        System.out.println("Yearly Salary of Employee 1: " + emp1.getYearlySalary());
        System.out.println("Yearly Salary of Employee 2: " + emp2.getYearlySalary());
    }
}
