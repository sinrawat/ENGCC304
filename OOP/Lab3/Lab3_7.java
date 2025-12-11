import java.util.Scanner;

class Employee {
    private final String employeeId;
    private String department;

    public Employee(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }
}

public class Lab3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String empId = scanner.nextLine();
        String initialDept = scanner.nextLine();
        String newDept = scanner.nextLine();

        Employee emp = new Employee(empId, initialDept);

        emp.setDepartment(newDept);

        System.out.println(emp.getEmployeeId());
        System.out.println(emp.getDepartment());

        scanner.close();
    }
}