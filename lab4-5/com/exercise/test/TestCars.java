package com.exercise.test;
import com.exercise.rental.Car;

public class TestCars 
{   
    public static void main(String[] args)
    {
        Car car1 = new Car("沪A000001", "宝马", 100);
        car1.displayInfo();
        System.out.println();
        car1.rent(5);
        car1.displayInfo();
        System.out.println();
        car1.rent(5);
        car1.displayInfo();
        System.out.println();
        car1.rent(5);
        car1.displayInfo();
        System.out.println();
        car1.SetDailyRent(-100);
        car1.SetRentedDays(-10);
        car1.displayInfo();
    }
}
