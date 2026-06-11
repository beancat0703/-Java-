package com.exercise.hr;

public class Person
{
    private String name;
    private int age;

    public Person()
    {
        this.name = "未知";
        this.age = 0;
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = isAgeLegal(age);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = isAgeLegal(age);
    }

    public int isAgeLegal(int age)
    {
        if (age >= 0 && age <= 150)
        {
            return age;
        }
        else
        {
            return 0;
        }

    }

    public void introduce()
    {
        System.out.println("我叫" + this.name + "，今年" + this.age + "岁");
    }
}
