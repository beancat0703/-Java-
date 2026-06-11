public class Employee 
{
    private String empName;
    String department;
    protected double baseSalary;
    public int empId;

    public Employee(String empName, String department, double baseSalary, int empId)
    {
        this.empName = empName;
        this.department = department;
        this.baseSalary = baseSalary;
        this.empId = empId;
    }

    public void showInfo()
    {
        System.out.println("员工姓名：" + empName);
        System.out.println("部门：" + department);
        System.out.println("基本工资：" + baseSalary);
        System.out.println("员工编号：" + empId);
    }

    public int countDigitsInName()
    {
        int count = 0;
        for (char c: empName.toCharArray())
        {
            if (Character.isDigit(c))
            {
                count ++;
            }
        }
        return count;
    }
}
