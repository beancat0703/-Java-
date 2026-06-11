package com.exercise.test;
import com.exercise.time.Time;

public class TestTime
{
    public static void main(String[] args)
    {
        Time t1 = new Time(10, 10, 10);
        //打印原时间
        System.out.println(t1.toStandardString());
        //测试进位
        t1.addSeconds(120);
        System.out.println(t1.toStandardString());
        t1.addSeconds(120000);
        System.out.println(t1.toStandardString());
        //构造比较对象
        Time t2 = new Time(11, 10, 10);
        //测试比较
        if (t1.isEarlier(t2) == true)
        {
            System.out.println("早于t2时间");
        }
        else
        {
            System.out.println("晚于t2时间");
        }
    }
}