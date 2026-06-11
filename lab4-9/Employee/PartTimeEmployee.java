public class PartTimeEmployee extends Employee
{
    private int hour;
    private double hourlySalary;

    PartTimeEmployee(String name, String id, int hour, double hourlySalary)
    {
        super(name, id);
        this.hour = hour;
        this.hourlySalary = hourlySalary;
    }

    @Override
    public double calculateSalary()
    {
        return hour * hourlySalary;
    }
}
