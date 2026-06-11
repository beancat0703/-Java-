package com.exercise.store;

public class Book 
{
    private String title;
    private String author;
    private double price;
    private int stock;

    public Book()
    {
        this.title = "未知";
        this.author = "未知";
        this.price = 0.0;
        this.stock = 0;
    }

    public Book(String title, String author, double price, int stock)
    {
        this.title = title;
        this.author = author;
        this.price = isPriceLegal(price);
        this.stock = isStockLegal(stock);
    }

    private double isPriceLegal(double price)
    {
        if (price >= 0)
        {
            return price;
        }
        else
        {
            return 0.0;
        }
    }

    private int isStockLegal(int stock)
    {
        if (stock >= 0)
        {
            return stock;
        }
        else
        {
            return 0;
        }
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double price)
    {
        this.price = isPriceLegal(price);
    }

    public int getStock()
    {
        return this.stock;
    }

        public void setStock(int stock)
    {
        this.stock = isStockLegal(stock);
    }

    public boolean sell(int quantity)
    {
        if (quantity > 0 && quantity <= this.stock)
        {
            this.stock -= quantity;
            return true;
        }
        else
        {
            System.out.println("销售失败");
            return false;
        }
    }

    public void restock(int quantity)
    {
        if (quantity > 0)
        {
            this.stock += quantity;
        }
    }

    public void display()
    {
        System.out.println("库存：" + this.stock);
    }
}

