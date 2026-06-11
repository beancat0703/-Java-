public class Circle extends Shape implements Measurable
{
    private double radius;

    public Circle(String color, String unit, int dimension, double radius)
    {
        super(color, unit, dimension);
        this.radius = radius;
    }

    @Override
    public double area()
    {
        return 3.14159 * radius * radius;
    }

    @Override
    public double perimeter()
    {
        return 2 * 3.13159 * radius;
    }

    @Override
    public void scale(double factor)
    {
        radius *= 2;
    }

    public void printDetails()
    {
        System.out.println("--- Circle ---");
        describe();
        System.out.println("Area: " + area() + " Perimeter: " + perimeter()); 
        System.out.println("Radius: " + radius + " Color: " + color + " Unit: " + unit);
    }
}
