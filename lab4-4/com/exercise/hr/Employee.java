package com.exercise.hr;

public class Employee 
{
    private String empId;
    private String name;
    private double baseSalary;
    private double bonus;

    public Employee()
    {
        this.empId = "E000";
        this.name = "新员工";
        this.baseSalary = 0;
        this.bonus = 0;
    }

    public Employee(String empId, String name, double baseSalary, double bonus)
    {
        this.empId = empId;
        this.name = name;
        this.baseSalary = islegal(baseSalary);
        this.bonus = islegal(bonus);
    }

    private double islegal(double number)
    {
        if (number >= 0)
        {
            return number;
        }
        else
        {
            return 0;
        }
    }

    public String getEmpId()
    {
        return empId;
    }

    public void setEmpId(String empId)
    {
        this.empId = empId;
    }

    public String name()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary)
    {
        this.baseSalary = islegal(baseSalary);
    }

        public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = islegal(bonus);
    }

    public double getActualSalaty()
    {
        return (baseSalary + bonus);
    }

    public void raiseBaseSalary(double percent)
    {
        if (percent > 0)
        {
            this.baseSalary = this.baseSalary * (1 + (percent / 100));
        }
    }

    public void display()
    {
        System.out.println("工号：" + empId);
        System.out.println("姓名：" + name);
        System.out.println("最终实际工资：" + getActualSalaty() + "元");
    }
}
