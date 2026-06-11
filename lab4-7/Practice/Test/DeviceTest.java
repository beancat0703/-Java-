package Practice.Test;

import Practice.Device.Laptop;
import Practice.Device.Smartphone;

public class DeviceTest 
{
    public static void main(String[] args)
    {
        Laptop laptop1 = new Laptop("Dell", "XPS15", 130, 9999, 16, 512, 15.6);
        Smartphone phone1 = new Smartphone("Apple", "iPhone15", 20, 6999, 48, true, "Black");

        System.out.println("\n--- Laptop ---");
        laptop1.turnOn();
        laptop1.showSpecs();
        laptop1.openLid();
        laptop1.turnOff();

        System.out.println("\n--- Smartphone ---");
        phone1.turnOn();
        phone1.showSpecs();
        phone1.takePhoto();
        phone1.turnOff();
    }
}
