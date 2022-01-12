package Chapter7;

public class Test_Employee {
    public static void main(String[] args) {
        PartTimeEmployee pt = new PartTimeEmployee();
        pt.fname = "Sujal";
        pt.lname = " Shrestha";
        pt.hourlySalary=1200;
        pt.noOFDays=26;
        System.out.println("Full name is :"+ pt.displayName());
        System.out.println("Salary is : "+ pt.calculateAnnualSal());

        FullTimeEmployee ft = new FullTimeEmployee();
        ft.fname= "Suzal";
        ft.lname="Shrestha";
        ft.monthlySalary=24000;
        System.out.println("Full name is :"+ ft.displayName());
        System.out.println("Salary is :" +ft.calculateAnnualSal());
    }
}
