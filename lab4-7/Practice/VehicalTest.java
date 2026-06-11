package Practice;

public class VehicalTest 
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Alice", "京A12345", 4, 50, "Automatic", 5, true);
        Motorcycle cycle1 = new Motorcycle("Bob", "沪B67890", 2, 15, false, 600, "Cruiser");
        System.out.println("--- Car ---");
        car1.start();
        car1.showDetails();
        car1.honk();
        car1.stop();
        System.out.println("\n--- Motorcycle ---");
        cycle1.start();
        cycle1.showDetails();
        cycle1.wheelie();
        cycle1.stop();
    }
}
