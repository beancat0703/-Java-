package Practice;

public class Vehical 
{
    public String ownerName;
    protected String licensePlate;
    int wheels;
    private double fuelCapacity;

    public Vehical(String ownerName, String licensePlate, int wheels, double fuelCapacity)
    {
        this.ownerName = ownerName;
        this.licensePlate = licensePlate;
        this.wheels = wheels;
        this.fuelCapacity = fuelCapacity;
    }

    public void start()
    {
        System.out.println(ownerName + "'s vehical is starting.");
    }

    public void stop()
    {
        System.out.println("Vehical is stopping.");
    }

    public void showDetails()
    {
        System.out.println("Owner: " + ownerName);
        System.out.println("Plate: " + licensePlate);
        System.out.println("Wheels: " + wheels);
        System.out.println("Fuel: " + fuelCapacity + "L");
    }
}

class Car extends Vehical
{
    private String transmissionType;
    private int seatCount;
    boolean hasSunroof;

    public Car(String ownerName, String licensePlate, int wheels, double fuelCapacity, String transmissionType, int seatCount, boolean hasSunroof)
    {
        super(ownerName, licensePlate, wheels, fuelCapacity);
        this.transmissionType = transmissionType;
        this.seatCount = seatCount;
        this.hasSunroof = hasSunroof;
    }

    @Override
    public void start()
    {
        System.out.println(ownerName + "'s car engine roars to life.");
    }

    @Override
    public void showDetails()
    {
        super.showDetails();
        System.out.println("Transmission: " + transmissionType);
        System.out.println("Seat: " + seatCount);
        System.out.println("Sunroof: " + hasSunroof);
    }

    public void honk()
    {
        System.out.println("Beep beep!");
    }
}

class Motorcycle extends Vehical
{
    private boolean hasSidecar;
    private int engineCC;
    String type;

    public Motorcycle(String ownerName, String licensePlate, int wheels, double fuelCapacity, boolean hasSidecar, int engineCC, String type)
    {
        super(ownerName, licensePlate, wheels, fuelCapacity);
        this.hasSidecar = hasSidecar;
        this.engineCC = engineCC;
        this.type = type;
    }

    @Override
    public void stop()
    {
        System.out.println("Motorcycle brakes screech!");
        super.stop();
    }

    @Override
    public void showDetails()
    {
        super.showDetails();
        System.out.println("Sidecar: " + hasSidecar);
        System.out.println("Engine: " + engineCC + "cc");
        System.out.println("Type: " + type);
    }

    public void wheelie()
    {
        System.out.println("Doing a wheelie!");
    }
}


