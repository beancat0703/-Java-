public class Main 
{
    public static void main(String[] args)
    {
        FullTimeEmployee e1 = new FullTimeEmployee("张三", "E001", 6000);
        PartTimeEmployee e2 = new PartTimeEmployee("李四", "E002", 80, 50);

        System.out.printf("员工姓名：%s，工号：%s，工资：%.1f\n", e1.name, e1.id, e1.calculateSalary());
        System.out.printf("员工姓名：%s，工号：%s，工资：%.1f\n", e2.name, e2.id, e2.calculateSalary());
    }
}
