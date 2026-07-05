class ElectronicDevice
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
        System.out.println(brand + model + " is turning on.");
    }

    public void turnOff()
    {
        System.out.println(brand + model + " is turning off.");
    }

    public void showSpecs()
    {
        System.out.println("品牌：" + brand);
        System.out.println("型号：" + model);
        System.out.println("功率：" + power);
        System.out.println("价格：" + price);
    }
}

class Laptop extends ElectronicDevice
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
        System.out.println("内存：" + ramSize);
        System.out.println("存储：" + storageSize);
        System.out.println("屏幕尺寸：" + screenSize);
    }

    public void openLid()
    {
        System.out.println("Lid opened.");
    }
}

class Test
{
    public static void main(String[] args)
    {
        Laptop Mac = new Laptop("Apple", "MacBook Neo", 20, 3999, 8, 512, 13.6);
        Mac.turnOn();
        Mac.turnOff();
        Mac.openLid();
        Mac.showSpecs();
    }
}