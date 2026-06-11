package com.exercise.test;

import com.exercise.hr.Employee;

public class TestEmployee 
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("202601", "小张", 8000, 2000);
        //显示原总工资
        emp1.display();
        //提升基本工资
        emp1.raiseBaseSalary(10);
        //显示提升后的总工资
        emp1.display();
    }
}
