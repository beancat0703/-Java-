public class Main 
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle("Red", "cm", 2, 5, 10);
        shapes[1] = new Circle("Blue", "m", 2, 5);

        for (Shape i: shapes)
        {
            if (i instanceof Rectangle)
            {
                Rectangle r = (Rectangle) i;
                r.printDetials();
                System.out.println();
                System.out.println("After scaling by 2:");
                r.scale(2);
                System.out.println("Area: " + r.area() + " Perimeter: " + r.perimeter());
                System.out.println(); 
            }
            else if (i instanceof Circle)
            {
                Circle c = (Circle) i;
                c.printDetails();
                System.out.println();
                System.out.println("After scaling by 2:");
                c.scale(2);
                System.out.println("Area: " + c.area() + " Perimeter: " + c.perimeter());  
                System.out.println(); 
            }
        }

        shapes[0].color = "Green";
        shapes[0].unit = "mm";
        System.out.println("After modification: Color: " + shapes[0].color + " Unit: " + shapes[0].unit);
        shapes[0].describe();
    }
}
