package practice;

public class EmployeeRY {
    public void showFulltimeKennyGyEmployeeDetail(){
        System.out.println("Name = Kenny Gy");
        System.out.println("Position = Developer");
        System.out.println("Type = Fulltime");
        System.out.println("Salary = 4000");
    }
    public void showFulltimeJohnWickEmployeeDetail(){
        System.out.println("Name = John Wick");
        System.out.println("Position = Actor");
        System.out.println("Type = Fulltime");
        System.out.println("Salary = 5000");
    }
    public void showParttimeVinnothEmployeeDetail(){
        System.out.println("Name = Vinnoth");
        System.out.println("Position = QA");
        System.out.println("Type = Parttime");
        System.out.println("Arte = 20");
    }
    public static void main(String[] args){
        EmployeeRY employee = new EmployeeRY();
        employee.showFulltimeKennyGyEmployeeDetail();
        employee.showParttimeVinnothEmployeeDetail();

    }
}
