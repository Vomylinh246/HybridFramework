package practice;

public class EmployeeDRY {
    private String employeeName;
    private String employeePosition;
    private String employeeType;
    private String employeeSalary;
    private String employeeRate;

    public EmployeeDRY(String employeeName, String employeePosition, String employeeType, String employeeSalary, String employeeRate) {
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
        this.employeeType = employeeType;
        this.employeeSalary = employeeSalary;
        this.employeeRate = employeeRate;
    }

    public void showEmployeeInfo() {
        System.out.println("Name = " + this.employeeName);
        System.out.println("Position = " + this.employeePosition);
        System.out.println("Type = " + this.employeeType);

        if (this.employeeType.equalsIgnoreCase("Fulltime")) {
            System.out.println("Salary = " + this.employeePosition);
        } else {
            System.out.println("Rate = " + this.employeeRate);
        }
    }

    public static void main(String[] args) {
        EmployeeDRY kennygy = new EmployeeDRY("Kenny Gy", "Developer", "Developer", "4000", "");
        kennygy.showEmployeeInfo();
        EmployeeDRY johnwick = new EmployeeDRY("John Wick", "Actor", "Fulltime","5000", "");
        johnwick.showEmployeeInfo();
        EmployeeDRY vinnoth = new EmployeeDRY("Vin Noth", "QA", "Parttime","", "20");
        vinnoth.showEmployeeInfo();
    }
}
