package Chapter7;

public class PartTimeEmployee extends Employee{
    public int noOFDays;
    public float hourlySalary;
    public float calculateAnnualSal(){
        return hourlySalary * noOFDays *12;
    }


}
