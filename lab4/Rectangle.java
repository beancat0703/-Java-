public class Rectangle 
{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        if(length > 0 && width > 0)
        {
            this.length = length;
            this.width = width;
        }
        else
        {
            System.out.println("长度和宽度必须大于0");
        }
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double amount)
    {
        if (amount > 0)
        {
            this.length = amount;
        }
        else
        {
            System.out.println("长度必须大于0");
        }
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double amount)
    {
        if (amount > 0)
        {
            this.width = amount;
        }
        else
        {
            System.out.println("宽度必须大于0");
        }
    }

    public double getArea()
    {
        double area = this.length * this.width;
        return area;
    }

    public double getPerimeter()
    {
        double perimeter = (this.length + this.width) * 2;
        return perimeter;
    }

    public void isSquare()
    {
        if (this.length == this.width)
        {
            System.out.println("是正方形");
        }
        else
        {
            System.out.println("不是正方形");
        }
    }

    @Override
    public String toString()
    {
        return String.format("矩形 [长度: %.2f, 宽度: %.2f, 面积: %.2f, 周长: %.2f]", this.length, this.width, getArea(), getPerimeter());
    }
}

class TestRectangle
{
    public static void main(String[] args)
    {
        Rectangle rec1 = new Rectangle(10, 5);
        //测试toString
        System.out.println(rec1.toString());
        //测试isSquare
        rec1.isSquare();

        //测试非法构造
        Rectangle rec2 = new Rectangle(10, -5);

        Rectangle rec3 = new Rectangle(5, 5);
        //测试toString
        System.out.println(rec3.toString());
        //测试isSquare
        rec3.isSquare();
        //测试set方法
        rec3.setLength(10);
        System.out.println(rec3.toString());
        //测试非法set
        rec3.setWidth(-10);
    }
}