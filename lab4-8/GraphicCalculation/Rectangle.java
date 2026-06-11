public class Rectangle extends Shape implements Measurable
{
    private double width;
    private double height;

    public Rectangle(String color, String unit, int dimension, double width, double height)
    {
        super(color, unit, dimension);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area()
    {
        return width * height;
    }

    @Override
    public double perimeter()
    {
        return 2 * (width + height);
    }

    @Override
    public void scale(double factor) 
    {
        width *= 2;
        height *= 2;
    }

    public void printDetials()
    {
        System.out.println("--- Rectangle ---");
        describe();
        System.out.println("Area: " + area() + " Perimeter: " + perimeter());   
        System.out.println("Width: " + width + " Height: " + height + " Color: " + color + " Unit: " + unit);
    }
}