package Practice.Device;
public class Smartphone extends ElectronicDevice
{
    private int cameraMegapixels;
    private boolean has5G;
    String color;

    public Smartphone(String brand, String model, int power, double price, int cameraMegapixels, boolean has5G, String color)
    {
        super(brand, model, power, price);
        this.cameraMegapixels = cameraMegapixels;
        this.has5G = has5G;
        this.color = color;
    }

    @Override
    public void turnOff()
    {
        System.out.println("Saving data...");
        super.turnOff();
    }

    @Override
    public void showSpecs()
    {
        super.showSpecs();
        System.out.println("摄像头像素：" + cameraMegapixels + "MP");
        System.out.println("5G支持：" + has5G);
        System.out.println("颜色：" + color);
    }

    public void takePhoto()
    {
        System.out.println("Taking photo with " + cameraMegapixels + " MP camera.");
    }
}
