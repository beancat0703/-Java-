package com.exercise.test;
import com.exercise.store.Book;

public class TestBook 
{
    public static void main(String[] args)
    {
        Book book1 = new Book("线性代数", "张老师", 35.0, 6);
        //显示原库存
        book1.display();
        //测试销售
        book1.sell(3);
        //显示销售后的库存
        book1.display();
        //测试进货
        book1.restock(10);
        //显示进货后的库存
        book1.display();
        //测试销售超过库存的数量
        book1.sell(30);
        //显示过量销售后的库存
        book1.display();
    }
}
