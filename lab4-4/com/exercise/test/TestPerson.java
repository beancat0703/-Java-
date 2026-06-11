package com.exercise.test;

import com.exercise.hr.Person;

public class TestPerson 
{
    public static void main(String[] agrs)
    {
        //测试无参数构造
        Person person1 = new Person();
        person1.introduce();

        //测试有参数构造
        Person person2 = new Person("小张", 18);
        person2.introduce();

        //测试非法set
        person2.setAge(-18);
        person2.introduce();
    }
}
