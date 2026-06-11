public class Main 
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4, 5);

        System.out.printf("圆形面积：%.2f\n", circle.getArea());
        System.out.println("圆形周长：" + circle.getPerimeter());
        System.out.println("矩形面积：" + rectangle.getArea());
        System.out.println("矩形周长：" + rectangle.getPerimeter());
    }
}
