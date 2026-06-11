package com.exercise.test;
import com.exercise.product.Product;

public class TestProduct 
{
    public static void main(String[] args)
    {
        //无参数构造
        Product pd1 = new Product();
        pd1.displayInfo();
        System.out.println();
        //手动set参数
        pd1.setId("001");
        pd1.setName("电风扇");
        pd1.setOriginalPrice(100);
        pd1.setDiscountRate(0.9);
        pd1.displayInfo();
        System.out.println();
        //有参数构造
        Product pd2 = new Product("002", "鼠标", 200, 0.8);
        pd2.displayInfo();
        System.out.println();
        //非法修改折扣率
        pd2.setDiscountRate(1.5);
        pd2.displayInfo();
    }
}
