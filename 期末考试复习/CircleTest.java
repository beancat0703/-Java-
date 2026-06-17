class Circle
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double circumference()
    {
        return 2 * 3.14 * radius;
    }

    public double area()
    {
        return 3.14 * radius * radius;
    }

    public double getR()
    {
        return radius;
    }

    public void setR(double radius)
    {
        this.radius = radius;
    }
}

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(4);

        double circumference = c1.circumference();
        double area = c1.area();

        System.out.println("周长：" + circumference);
        System.out.println("面积：" + area);
    }
}
