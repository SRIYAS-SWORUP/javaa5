public class Q7 {

    public static void main(String[] args) {
        HourlyEmployee employee = new HourlyEmployee("John Smith", 7569, 100, 2000);
        employee.display();
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name : " + name);
    }
}

class Employee extends Person {
    private int empid;

    public Employee(String name, int empid) {
        super(name);
        this.empid = empid;
    }

    public void display() {
        super.display();
        System.out.println("EmpID : " + empid);
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, int empid, double hourlyRate, double hoursWorked) {
        super(name, empid);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getGrossPay() {
        return hourlyRate * hoursWorked;
    }

    public void display() {
        super.display();
        System.out.println("Hourly Rate : " + hourlyRate);
        System.out.println("Hours worked : " + hoursWorked);
        System.out.println("Gross pay : " + getGrossPay());
    }
}