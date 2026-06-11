package com.exercise.product;

public class Product 
{
    private String id;
    private String name;
    private double originalPrice;
    private double discountRate;

    public Product()
    {
        this.id = "000";
        this.name = "无";
        this.originalPrice = 0.0;
        this.discountRate = 1.0;
    }

    public Product(String id, String name, double originalPrice, double discountRate)
    {
        this.id = id;
        this.name = name;
        this.originalPrice = isOriginalPriceLegal(originalPrice);
        this.discountRate = isDiscountRateLegal(discountRate);
    }

    private double isOriginalPriceLegal(double originalPrice)
    {
        if (originalPrice >= 0)
        {
            return originalPrice;
        }
        else
        {
            return 0.0;
        }
    }

    private double isDiscountRateLegal(double discountRate)
    {
        if (discountRate < 0)
        {
            return 0;
        }
        else if (discountRate >= 0 && discountRate<= 1)
        {
            return discountRate;
        }
        else
        {
            return 1.0;
        }
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

        public double getOriginalPrice()
    {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice)
    {
        this.originalPrice = isOriginalPriceLegal(originalPrice);
    }

    public double getDiscountRate()
    {
        return discountRate;
    }

    public void setDiscountRate(double discountRate)
    {
        this.discountRate = isDiscountRateLegal(discountRate);
    }

    public double getDiscountedPrice()
    {
        return (originalPrice * discountRate);
    }

    public void displayInfo()
    {
        System.out.println("商品编号：" + id);
        System.out.println("商品名称：" + name);
        System.out.println("商品原价：" + originalPrice);
        System.out.println("商品折扣率：" + discountRate);
        System.out.println("商品折扣价：" + getDiscountedPrice());
    }
}