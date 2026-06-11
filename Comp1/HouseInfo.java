import java.util.ArrayList;

class House
{
    public String type;
    public double size;
    public double remainingSize;
    public ArrayList<String> furniture;

    public House(String type, double size)
    {
        this.type = type;
        this.size = size;
        this.remainingSize = size;
        this.furniture = new ArrayList<>();
    }

    public void printInfo()
    {
        System.out.println("户型：" + type);
        System.out.println("总面积：" + size + " 平方米");
        System.out.println("剩余面积：" + remainingSize + " 平方米");
        System.out.println("家具名称列表：" + furniture);
    }

    public void addFurniture(Furniture item)
    {
        this.furniture.add(item.name);
        this.remainingSize -= item.area;
    }
}

class Furniture
{
    public String name;
    public double area;

    public Furniture(String name, double area)
    {
        this.name = name;
        this.area = area;
    }
}

public class HouseInfo
{
    public static void main(String[] args)
    {
        House house1 = new House("三室一厅", 101);
        house1.printInfo();

        Furniture fur1 = new Furniture("床", 4);
        Furniture fur2 = new Furniture("衣柜", 2);
        Furniture fur3 = new Furniture("餐桌", 1.5);

        house1.addFurniture(fur1);
        house1.addFurniture(fur2);
        house1.addFurniture(fur3);

        System.out.println("\n添加家具后：\n");
        house1.printInfo();
    }
}