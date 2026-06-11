public abstract class Employee
{
    protected String name;
    protected String id;

    public abstract double calculateSalary();

    public Employee(String name, String id)
    {
        this.name = name;
        this.id = id;
    }
}