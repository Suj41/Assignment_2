package Chapter7;

public class FullTimeEmployee extends Employee{
    public float monthlySalary;
    public float calculateAnnualSal()
    {
        return monthlySalary * 12;
    }
}
