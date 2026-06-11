public abstract class Shape 
{
    public String color;
    protected String unit;
    int dimension;

    public Shape(String color, String unit, int dimension)
    {
        this.color = color;
        this.unit = unit;
        this.dimension = dimension;
    }

    public abstract void scale(double factor);

    public void describe()
    {
        System.out.println("Color: " + color + " Unit: " + unit + " Dimension: " + dimension);
    }
}
