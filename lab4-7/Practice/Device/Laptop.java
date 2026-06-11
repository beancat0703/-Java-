package Practice.Device;
public class Laptop extends ElectronicDevice
{
    private int ramSize;
    private int storageSize;
    double screenSize;

    public Laptop(String brand, String model, int power, double price, int ramSize, int storageSize, double screenSize)
    {
        super(brand, model, power, price);
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn()
    {
        super.turnOn();
        System.out.println("Loading OS...");
    }

    @Override
    public void showSpecs()
    {
        super.showSpecs();
        System.out.println("内存：" + ramSize + "GB");
        System.out.println("存储：" + storageSize + "GB");
        System.out.println("屏幕尺寸：" + screenSize + " inches");
    }
    
    public void openLid()
    {
        System.out.println("Lid opened.");
    }
}
