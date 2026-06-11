package Practice.Device;
public class ElectronicDevice
{
    public String brand;
    protected String model;
    int power;
    private double price;

    public ElectronicDevice(String brand, String model, int power, double price)
    {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.price = price;
    }

    public void turnOn()
    {
        System.out.println(brand + " " + model + " is turning on.");
    }

    public void turnOff()
    {
        System.out.println(brand + " " + model + " is turning off.");
    }

    public void showSpecs()
    {
        System.out.println("品牌：" + brand);
        System.out.println("型号：" + model);
        System.out.println("功率：" + power + 'W');
        System.out.println("价格：" + price);
    }
}
