public class EmployeeTest 
{
    public static void main(String[] args)
    {
        Employee[] emp = new Employee[4];
        emp[0] = new Employee("emp1", "研发部门", 5000, 101);
        emp[1] = new Employee("emp12", "销售部门", 6000, 102);
        emp[2] = new Employee("emp123", "管理部门", 7000, 103);
        emp[3] = new Employee("emp1234", "制造部门", 8000, 104);

        for (Employee e: emp)
        {
            String emp16 = Integer.toHexString(e.empId);
            System.out.println("\n员工ID：" + e.empId + " -> " + "十六进制：" + emp16);
            System.out.println("员工姓名中数字个数：" + e.countDigitsInName());
        }

        double total = 0;
        for (Employee e: emp)
        {
            total += e.baseSalary;
        }
        double avg = total / 4;
        System.out.println("\n员工平均工资" + avg);

        System.out.println("-高于平均工资的员工-");
        for (Employee e:emp)
        {
            if (e.baseSalary > avg)
            {
                System.out.println();
                e.showInfo();
            }
        }
    }
}
