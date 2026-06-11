package com.exercise.rental;

public class Car 
{
    private String licensePlate;
    private String brand;
    private double dailyRent;
    private int rentedDays;

    public Car()
    {
        this.licensePlate = "未上牌";
        this.brand = "未知";
        this.dailyRent = 0.0;
        this.rentedDays = 0;
    }

    public Car(String licensePlate, String brand, double dailyRent)
    {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.dailyRent = isRentLegal(dailyRent);
        this.rentedDays = 0;
    }

    private double isRentLegal(double dailyRent)
    {
        if (dailyRent >= 0)
        {
            return dailyRent;
        }
        else
        {
            return 0.0;
        }
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }

    public void SetLicensePlate(String licensePlate)
    {
        this.licensePlate = licensePlate;
    }

    public String brand()
    {
        return brand;
    }

    public void SetBrand(String brand)
    {
        this.brand = brand;
    }

    public double dailyRent()
    {
        return dailyRent;
    }

    public void SetDailyRent(double dailyRent)
    {
        if (dailyRent >= 0)
        {
            this.dailyRent = dailyRent;
        }

    }

    public int rentedDays()
    {
        return rentedDays;
    }

    public void SetRentedDays(int rentedDays)
    {
        if (rentedDays >= 0)
        {
            this.rentedDays = rentedDays;
        }
    }

    public void rent(int days)
    {
        if (days >= 0)
        {
            rentedDays += days;
        }
    }

    public double calculateTotalRent()
    {
        return (rentedDays * dailyRent);
    }

    public void displayInfo()
    {
        System.out.println("车牌：" + licensePlate);
        System.out.println("品牌：" + brand);
        System.out.println("租金：" + dailyRent);
        System.out.println("已租借天数：" + rentedDays);
        System.out.println("总租金：" + calculateTotalRent());
    }
}
